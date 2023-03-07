package com.mnkqn.rentee.service.impl;

import com.mnkqn.rentee.domain.dto.AddressDto;
import com.mnkqn.rentee.domain.entity.Address;
import com.mnkqn.rentee.repository.AddressRepository;
import com.mnkqn.rentee.service.AddressService;
import com.mnkqn.rentee.util.mapstructMappers.AddressMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    @Override
    public AddressDto getById(Long id) {
        Address address = addressRepository.getAddressById(id);
        log.info(String.valueOf(address));
        return addressMapper.toDto(address);
    }
}
