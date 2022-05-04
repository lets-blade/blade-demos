package com.bladejava.lattice.bootstrap;

import com.bladejava.lattice.model.User;
import com.hellokaton.lattice.AuthInfo;
import com.hellokaton.lattice.LatticeRealm;
import com.hellokaton.lattice.LoginToken;
import com.hellokaton.lattice.exception.UnknownAccountException;

/**
 * @author hellokaton
 * @date 2022/5/4
 */
public class MyRealm implements LatticeRealm<User> {

    @Override
    public AuthInfo<User> doAuthenticate(LoginToken loginToken) {
        AuthInfo<User> authInfo = new AuthInfo<>();
        if (!"hellokaton".equals(loginToken.getUsername())) {
            throw new UnknownAccountException();
        }
        authInfo.setUsername(loginToken.getUsername());
        authInfo.setUser(new User("hellokaton", "123456", 18, "王爵nice"));

        return authInfo;
    }

    @Override
    public void doAuthorize(AuthInfo<User> authInfo) {

    }

}
