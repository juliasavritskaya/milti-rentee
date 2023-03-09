package com.mnkqn.accommodationservice.controller;

import com.mnkqn.accommodationservice.model.dto.AccommodationResponse;
import com.mnkqn.accommodationservice.service.AccommodationService;
import com.mnkqn.accommodationservice.util.requestsMappings.RequestsMappings;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(RequestsMappings.ACCOMMODATIONS_CONTROLLER)
public class AccommodationController {

    private final AccommodationService accommodationService;

    @GetMapping("/status/check")
    public String status()
    {
        return "Working";
    }

    @GetMapping
    public ResponseEntity<List<AccommodationResponse>> getAllAccommodations() {
        List<AccommodationResponse> accommodations= accommodationService.getAll();
        return ResponseEntity.ok().body(accommodations);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccommodationResponse> getById(@PathVariable Long id) {
        AccommodationResponse accommodation = accommodationService.getById(id);
        return ResponseEntity.ok().body(accommodation);
    }

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<List<AccommodationResponse>> getAllByUserId(@PathVariable String ownerId) {
        List<AccommodationResponse> accommodations= accommodationService.getAllByOwnerId(ownerId);
        return ResponseEntity.ok().body(accommodations);
    }

}
