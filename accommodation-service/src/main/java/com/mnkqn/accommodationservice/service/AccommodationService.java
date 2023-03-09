package com.mnkqn.accommodationservice.service;

import com.mnkqn.accommodationservice.model.dto.AccommodationResponse;

import java.util.List;

public interface AccommodationService {
    List<AccommodationResponse> getAll();

    List<AccommodationResponse> getAllByOwnerId(String id);

}
