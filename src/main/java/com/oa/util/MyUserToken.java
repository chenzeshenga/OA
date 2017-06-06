package com.oa.util;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * Created by bran on 2017/6/6.
 */
public class MyUserToken extends UsernamePasswordToken {
    private static final long serialVersionUID = 1L;
    private String userType;

    public MyUserToken(String username, String password,
                       boolean rememberMe, String userType) {
        super(username, password, rememberMe);
        this.userType = userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }
}
