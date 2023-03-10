package com.mnkqn.userservice.integration.model;

import lombok.Data;

@Data
public class AccommodationResponse {

    private Long id;

    private String name;

    private String description;

    private Integer price;

    private Short rooms;

    private Short bedrooms;

    private String ownerId;
}
