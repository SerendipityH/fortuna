package com.serendipity.fortuna.login.service.impl;

import com.serendipity.fortuna.login.mapper.AdminLoginMapper;
import com.serendipity.fortuna.login.domain.User;
import com.serendipity.fortuna.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/10 21:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AdminLoginMapper adminLoginMapper;
    @Override
    public User findByLoginAccount(String username, String password) {
        return adminLoginMapper.getById(username,password);
    }
}
