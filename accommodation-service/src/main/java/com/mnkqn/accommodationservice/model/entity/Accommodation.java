package com.mnkqn.accommodationservice.model.entity;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "accommodations")
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

    @Column(name = "owner_id")
    private String ownerId;

    //TODO
    /*private Status status*/

}
