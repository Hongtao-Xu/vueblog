package com.cn.shiro;

import org.apache.shiro.authc.AuthenticationToken;
import org.springframework.stereotype.Component;

/*
 *@program:自定义JwtToken
 *@author: xu-hongtao
 *@Time: 2021/5/21  16:35
 */

public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
