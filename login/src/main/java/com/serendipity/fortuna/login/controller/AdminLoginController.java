package com.serendipity.fortuna.login.controller;

import com.serendipity.fortuna.login.domain.User;
import com.serendipity.fortuna.login.result.CodeMsg;
import com.serendipity.fortuna.login.result.Result;
import com.serendipity.fortuna.login.service.UserService;
import com.serendipity.fortuna.login.vo.LoginVo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/10 20:57
 */
@RestController
@RequestMapping("fortuna/api/")
@CrossOrigin
@MapperScan("com.serendipity.fortuna.login.mapper")
public class AdminLoginController {

    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public Result adminLogin(@RequestBody LoginVo loginVo){
        String username = loginVo.getUsername();
        String password = loginVo.getPassword();
        User user = userService.findByLoginAccount(username, password);
        if(user != null){
            return Result.success(user);
        }else {
            return Result.error(CodeMsg.PASSWORD_ERROR);
        }
    }

}
