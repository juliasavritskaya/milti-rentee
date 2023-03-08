package com.mnkqn.userservice.service;

import com.mnkqn.userservice.domain.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserDto createUser(UserDto user);

    UserDto getUserDetailsByEmail(String email);

}
