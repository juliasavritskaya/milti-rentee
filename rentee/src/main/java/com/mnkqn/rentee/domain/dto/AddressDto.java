package com.mnkqn.rentee.domain.dto;

import com.mnkqn.rentee.domain.entity.Accommodation;
import lombok.Data;

@Data
public class AddressDto {

    private Long id;
    private String country;
    private String city;
    private String street;
    private String buildingNumber;
    private String apartmentNumber;
    private Accommodation accommodation;
}
