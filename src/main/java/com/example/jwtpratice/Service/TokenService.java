package com.example.jwtpratice.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TokenService {

    private String key = "nowzero";

    public String CreateToken(){

        HashMap<String, Object> headers = new HashMap<>();
        headers.put("typ","token");
        headers.put("alr","HS256");

        HashMap<String, Object> claims = new HashMap<>();
        claims.put("data","HELLO");


        String jwt = Jwts.builder()
                        .setHeader(headers)
                        .setClaims(claims)
                        .setSubject("user")
                        .signWith(SignatureAlgorithm.HS256, key.getBytes())
                        .compact(); // 특정한 알고리즘과 키를 가지고 사인을 한다.
        return jwt;
    }
}
