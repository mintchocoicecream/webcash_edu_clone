package com.clone.ohouse.service;

import com.clone.ohouse.dto.UserRequestDto;
import com.clone.ohouse.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserRequestDto userRequestDto;

    public UserService(UserRepository userRepository, UserRequestDto userRequestDto) {
        this.userRepository = userRepository;
        this.userRequestDto = userRequestDto;
    }

    public String serviceTest(){
        return userRepository.getUserInfo(userRequestDto.getName());
    }
}