package com.mnkqn.rentee.util.mapstructMappers;

import com.mnkqn.rentee.domain.dto.AddressDto;
import com.mnkqn.rentee.domain.entity.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {
    Address fromDto(AddressDto addressDto);

    AddressDto toDto(Address address);
}
