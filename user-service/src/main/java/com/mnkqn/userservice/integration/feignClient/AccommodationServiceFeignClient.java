package com.mnkqn.userservice.integration.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "accommodations-ws")
public interface AccommodationServiceFeignClient {

    @GetMapping
    void getUsersAccommodations();
}
