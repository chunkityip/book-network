package com.alibou.book.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service

public class JwtService {

    public String generateToken(UserDetails userDetails) {
        return generateToken(new HashMap<>() , userDetails);
    }

    private  String generateToken(Map<String, Object> claims, UserDetails userDetails) {
        return buildToken(claims, userDetails, jwtExpiration);
    }


}
