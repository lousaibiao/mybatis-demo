package com.lou.mybatis.mapper;

import com.lou.mybatis.model.ComplexUser;
import com.lou.mybatis.model.User;
import com.lou.mybatis.model.UserDetail;

import java.util.List;

public interface IUserMapper {
    List<User> allUsers();
    User findById(Integer id);
    UserDetail getUserDetailById(Integer userId);

    ComplexUser getUserWithAccounts(Integer userId);
    ComplexUser getUserWithAccounts2(Integer userId);



}
