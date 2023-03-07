package com.mnkqn.rentee.domain.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "additional_characteristics")
public class AdditionalCharacteristics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "has_furniture", nullable = false)
    private boolean hasFurniture;

    @Column(name = "has_fridge", nullable = false)
    private boolean hasFridge;

    @Column(name = "has_internet", nullable = false)
    private boolean hasInternet;

    @Column(name = "has_kitchen_furniture", nullable = false)
    private boolean hasKitchenFurniture;

    @Column(name = "has_washing_machine", nullable = false)
    private boolean hasWashingMachine;

    @Column(name = "has_balcony", nullable = false)
    private boolean hasBalcony;

    @Column(name = "has_plate", nullable = false)
    private boolean hasPlate;

    @Column(name = "has_tv", nullable = false)
    private boolean hasTv;

    @Column(name = "has_conditioner", nullable = false)
    private boolean hasConditioner;

    @OneToOne(mappedBy = "additionalCharacteristics")
    private Accommodation accommodation;
}
