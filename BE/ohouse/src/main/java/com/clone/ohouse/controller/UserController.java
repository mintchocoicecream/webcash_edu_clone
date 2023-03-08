package com.clone.ohouse.controller;

import com.clone.ohouse.domain.TestVO;
import com.clone.ohouse.mapper.TestMapper;
import com.clone.ohouse.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserController {

    private final UserService userService;
    private final TestMapper testMapper;


    @GetMapping(path = "/test")
    public String test() throws Exception {
        List<TestVO> testVO = testMapper.getTest();
        log.info("test : {}",  testVO.get(0).getTestId());
        return testVO.get(0).getTestId();
    }

}
