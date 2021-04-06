package com.orion.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/api/sample")
    public String sample() {
        CustomAuthenticationModel authentication = (CustomAuthenticationModel) SecurityContextHolder.getContext().getAuthentication();
        return authentication.getToken();
    }

    @RequestMapping("/api/test")
    public String apiTest() {
        CustomAuthenticationModel authentication = (CustomAuthenticationModel) SecurityContextHolder.getContext().getAuthentication();
        return authentication.getToken();
    }
}
