package com.sunytube.dao;

import com.sunytube.domain.User;
import com.sunytube.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    Integer addUser(User user);

    User getUserByPhone(String phone);

    Integer addUserInfo(UserInfo userInfo);
}
