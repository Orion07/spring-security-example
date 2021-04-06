package com.orion.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;

public class CustomAuthenticationModel extends AbstractAuthenticationToken {

    private String token;

    public CustomAuthenticationModel(String token) {
        super(AuthorityUtils.createAuthorityList("FIREBASE"));
        this.token = token;
        setAuthenticated(true);
    }

    public String getToken() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }
}
