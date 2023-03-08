package com.mnkqn.userservice.controller;

import com.mnkqn.userservice.domain.dto.UserCreateDto;
import com.mnkqn.userservice.domain.dto.UserDto;
import com.mnkqn.userservice.service.UserService;
import com.mnkqn.userservice.util.mapper.UserMapper;
import com.mnkqn.userservice.util.requestsMappings.RequestsMappings;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(RequestsMappings.SERVICE_NAME)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserCreateDto user) {

        UserDto userToCreate = userMapper.fromUserCreateDtoToUserDto(user);
        UserDto savedUser = userService.createUser(userToCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);

    }
}
