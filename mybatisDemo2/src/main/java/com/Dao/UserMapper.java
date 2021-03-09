package com.Dao;

import com.pojo.User;

import java.util.List;

/**
 * @author 517
 * @date 2021-03-09 - 11:03
 */
public interface UserMapper {
    List<User> getUserList();
    User getUserId(int id);
    Integer addUser(User user);
    Integer update(User user);
    Integer deleteUser(int id);
}
