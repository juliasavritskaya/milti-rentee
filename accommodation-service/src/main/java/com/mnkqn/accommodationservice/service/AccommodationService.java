package com.mnkqn.accommodationservice.service;

import com.mnkqn.accommodationservice.model.dto.AccommodationRequest;
import com.mnkqn.accommodationservice.model.dto.AccommodationResponse;

import java.util.List;

public interface AccommodationService {
    List<AccommodationResponse> getAll();

    List<AccommodationResponse> getAllByOwnerId(String id);

    AccommodationResponse getById(Long id);

    AccommodationResponse save(String user_uuid, AccommodationRequest accommodation);

}
