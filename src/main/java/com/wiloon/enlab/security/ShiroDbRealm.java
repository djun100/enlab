package com.wiloon.enlab.security;

import com.wiloon.enlab.entity.User;
import com.wiloon.enlab.service.AccountService;
import com.wiloon.enlab.service.AccountServiceImpl;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;


public class ShiroDbRealm extends AuthorizingRealm {
    Logger logger = Logger.getLogger(ShiroDbRealm.class);

    AccountService accountService;

    public ShiroDbRealm() {

    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.debug("shiro do get authorization info start.");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        return info;
    }

    //authentication
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        logger.debug("shiro do get authentication info start.");
        SimpleAuthenticationInfo info = null;
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        if (token.getUsername() != null) {
            User user = accountService.findUserByName(token.getUsername(), token.getPassword());

            if (user != null) {
                info = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), user.getUserName());
                logger.debug("create authentication info.");
            }
        } else {
            logger.debug("user name is null.");
        }

        return info;
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
}

