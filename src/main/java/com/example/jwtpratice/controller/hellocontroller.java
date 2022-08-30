package com.example.jwtpratice.controller;

import com.example.jwtpratice.Service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Token")
@Controller
@RequiredArgsConstructor
public class hellocontroller {

    private final TokenService tokenService;

    @GetMapping("/create")
    public String TokenTest(){

        String jwt = tokenService.CreateToken();

        return jwt;
    }

}
