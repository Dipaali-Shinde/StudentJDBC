package com.springmvcdemo.dao;

import com.springmvcdemo.pojo.User;

public interface UserDao {

	boolean checkUserCredentials(User user);
}
