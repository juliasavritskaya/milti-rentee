package com.mnkqn.accommodationservice.util.objectMapper;

import com.mnkqn.accommodationservice.model.dto.AccommodationResponse;
import com.mnkqn.accommodationservice.model.entity.Accommodation;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AccommodationMapper {
    AccommodationResponse fromAccommodationToAccommodationResponse(Accommodation accommodation);
    List<AccommodationResponse> fromAccommodationToAccommodationResponseList(List<Accommodation> accommodations);
}
