package com.mnkqn.accommodationservice.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AccommodationRequest {

    @NotNull(message = "Cannot be null")
    private String name;

    @NotNull(message = "Cannot be null")
    private String description;

    @NotNull(message = "Cannot be null")
    private Integer price;

    @NotNull(message = "Cannot be null")
    private Short rooms;

    @NotNull(message = "Cannot be null")
    private Short bedrooms;
}
