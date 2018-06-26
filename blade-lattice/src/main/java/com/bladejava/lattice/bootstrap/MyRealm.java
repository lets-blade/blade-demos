package com.bladejava.lattice.bootstrap;

import com.bladejava.lattice.model.User;
import io.github.biezhi.lattice.AuthInfo;
import io.github.biezhi.lattice.LatticeRealm;
import io.github.biezhi.lattice.LoginToken;
import io.github.biezhi.lattice.exception.UnknownAccountException;

/**
 * @author biezhi
 * @date 2018/6/4
 */
public class MyRealm implements LatticeRealm<User> {

    @Override
    public AuthInfo<User> doAuthenticate(LoginToken loginToken) {
        AuthInfo<User> authInfo = new AuthInfo<>();
        if (!"biezhi".equals(loginToken.getUsername())) {
            throw new UnknownAccountException();
        }
        authInfo.setUsername(loginToken.getUsername());
        authInfo.setUser(new User("biezhi", "123456", 18, "王爵nice"));

        return authInfo;
    }

    @Override
    public void doAuthorize(AuthInfo<User> authInfo) {

    }

}
