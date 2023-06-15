package com.jdbclogin.dao;
import com.jdbclogin.pojo.User;
public interface UserDao {
	boolean addNewUser(User user);
	boolean checkUserCredentials(User user);
}
