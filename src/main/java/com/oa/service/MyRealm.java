package com.oa.service;

import com.oa.util.MyUserToken;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by bran on 2017/6/6.
 */
public class MyRealm extends AuthorizingRealm {
    //    身份验证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        MyUserToken token = (MyUserToken) authenticationToken;
        String password = loginService.getPasswordFromUsernameAndType((String) token.getPrincipal(), token.getUserType());
        if (password.equals(null))
            return null;
        return new SimpleAuthenticationInfo(
                token.getPrincipal(),
                password,
                getName()
        );
    }


    //    授权操作
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Autowired
    LoginService loginService;
}
