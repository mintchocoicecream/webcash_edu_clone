package com.clone.ohouse.controller;

import com.clone.ohouse.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/test")
    public String test(){
        return userService.serviceTest();
    }

}
