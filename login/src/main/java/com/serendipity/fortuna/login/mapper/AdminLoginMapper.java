package com.serendipity.fortuna.login.mapper;

import com.serendipity.fortuna.login.domain.User;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/10 21:15
 */
@Repository
public interface AdminLoginMapper {

    @Select("select username,password from user where username = #{username} and password=#{password}")
    User getById(@Param("username") String username,@Param("password")String password);
}
