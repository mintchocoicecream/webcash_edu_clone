package com.clone.ohouse.service;

import com.clone.ohouse.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRequestDto userRequestDto;

}