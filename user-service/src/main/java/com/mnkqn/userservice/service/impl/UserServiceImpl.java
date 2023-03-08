package com.mnkqn.userservice.service.impl;

import com.mnkqn.userservice.domain.dto.UserDto;
import com.mnkqn.userservice.domain.entity.User;
import com.mnkqn.userservice.repository.UserRepository;
import com.mnkqn.userservice.service.UserService;
import com.mnkqn.userservice.util.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {

        user.setUserId(UUID.randomUUID().toString());
        user.setEncryptedPassword("enc pas");
        User createdUser = userRepository.save(userMapper.fromUserDtoToUserEntity(user));

        return userMapper.fromUserEntityToUserDto(createdUser);
    }
}
