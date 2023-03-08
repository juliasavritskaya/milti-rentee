package com.mnkqn.userservice.service.impl;

import com.mnkqn.userservice.domain.dto.UserDto;
import com.mnkqn.userservice.domain.entity.User;
import com.mnkqn.userservice.repository.UserRepository;
import com.mnkqn.userservice.service.UserService;
import com.mnkqn.userservice.util.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    @Override
    public UserDto createUser(UserDto user) {

        user.setUserId(UUID.randomUUID().toString());
        user.setEncryptedPassword(encoder.encode(user.getPassword()));

        User createdUser = userRepository.save(userMapper.fromUserDtoToUserEntity(user));

        return userMapper.fromUserEntityToUserDto(createdUser);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(username);
        if (user == null) throw new UsernameNotFoundException(username);

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getEncryptedPassword(), true, true, true, true, new ArrayList<>());

    }

    @Override
    public UserDto getUserDetailsByEmail(String email) {

        User user = userRepository.findByEmail(email);
        if (user == null) throw new UsernameNotFoundException(email);

        return userMapper.fromUserEntityToUserDto(user);
    }
}
