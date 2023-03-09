package com.mnkqn.accommodationservice.controller;

import com.mnkqn.accommodationservice.util.requestsMappings.RequestsMappings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RequestsMappings.ACCOMMODATIONS_CONTROLLER)
public class AccommodationController {

    @GetMapping("/status/check")
    public String status()
    {
        return "Working";
    }

}
