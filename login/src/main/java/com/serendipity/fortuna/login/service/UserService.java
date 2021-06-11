package com.serendipity.fortuna.login.service;

import com.serendipity.fortuna.login.domain.User;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/10 21:43
 */

public interface UserService {
    User findByLoginAccount(String username,String password);
}
