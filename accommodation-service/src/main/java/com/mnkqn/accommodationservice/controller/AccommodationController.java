package com.mnkqn.accommodationservice.controller;

import com.mnkqn.accommodationservice.model.dto.AccommodationRequest;
import com.mnkqn.accommodationservice.model.dto.AccommodationResponse;
import com.mnkqn.accommodationservice.service.AccommodationService;
import com.mnkqn.accommodationservice.util.requestsMappings.RequestsMappings;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping(value = "")
    public ResponseEntity<AccommodationResponse> createAccommodation(@RequestHeader(value = "user_uuid") String user_uuid,
                                                                   @RequestBody @Valid AccommodationRequest accommodation) {

        AccommodationResponse createdAccommodation = accommodationService.save(user_uuid, accommodation);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAccommodation);
    }

/*    @PostMapping(value = "")
    public ResponseEntity<AccommodationResponse> saveAccommodation(@RequestHeader(value = HttpHeaders.AUTHORIZATION) String authorizationHeader,
                                                  @RequestBody @Valid AccommodationRequest accommodation) {

        AccommodationResponse createdAccommodation = accommodationService.save(authorizationHeader, accommodation);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAccommodation);
    }*/

}
