package com.mnkqn.rentee.controller;

import com.mnkqn.rentee.domain.dto.AddressDto;
import com.mnkqn.rentee.service.AddressService;
import com.mnkqn.rentee.util.requestMapping.RequestsMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(RequestsMapping.ADDRESS_CONTROLLER)
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/{id}")
    public ResponseEntity<AddressDto> getAddressById(@PathVariable Long id) {
        AddressDto address = addressService.getById(id);
        return ResponseEntity.ok(address);
    }
}
