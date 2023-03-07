package com.mnkqn.rentee.domain.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "accommodation")
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "rooms")
    private Short rooms;

    @Column(name = "bedrooms")
    private Short bedrooms;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "additional_characteristics_id", referencedColumnName = "id")
    private AdditionalCharacteristics additionalCharacteristics;

/*    @ManyToOne
    private User owner;*/

}
