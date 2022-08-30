package com.example.jwtpratice;

import com.example.jwtpratice.Service.TokenService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test1 {

    @Autowired
    private TokenService tokenService;

    @Test
    void 테스트_1(){


        String jwt = tokenService.CreateToken();

        System.out.println(jwt);
    }
}
