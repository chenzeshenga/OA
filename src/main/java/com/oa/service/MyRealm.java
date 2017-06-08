package com.oa.service;

import com.oa.util.MyUserToken;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
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
        String str=(String)authenticationToken.getPrincipal();
        String user[]=str.split(":");
        String userType=user[0];
        String userName=user[1];
        String password = loginService.getPasswordFromUsernameAndType(userName,userType);
        if (password.equals(null))
            return null;
        return new SimpleAuthenticationInfo(
                str,
                password,
                getName()
        );
    }


    //    授权操作
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String str=(String)principalCollection.getPrimaryPrincipal();

        System.err.println(str);
        if(!str.equals("")) {
            String user[] = str.split(":");
            String userType = user[0];

            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            info.addRole(userType);

            return info;
        }
        return null;
    }

    @Autowired
    LoginService loginService;
}
