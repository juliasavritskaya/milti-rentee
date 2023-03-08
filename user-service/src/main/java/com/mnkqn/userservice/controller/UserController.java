package com.mnkqn.userservice.controller;

import com.mnkqn.userservice.domain.dto.UserCreateDto;
import com.mnkqn.userservice.util.requestsMappings.RequestsMappings;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(RequestsMappings.SERVICE_NAME)
public class UserController {

    @GetMapping("status/check")
    public String status() {
        return "Working";
    }

    @PostMapping
    public String createUser(@Valid @RequestBody UserCreateDto user) {
        return "Created";
    }
}
