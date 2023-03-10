package com.mnkqn.accommodationservice.integration.feignClient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "accommodations-ws")
public interface UserServiceFeignClient {

}
