package com.springmvcdemo.daoimpl;

import org.springframework.stereotype.Component;
import com.springmvcdemo.dao.UserDao;
import com.springmvcdemo.pojo.User;

@Component
public class UserDaoImpl implements UserDao {

	@Override
	public boolean checkUserCredentials(User user) {
		if(user.getUsername().equals("ABC@gmail.com") && 
				user.getPassword().equals("ABC@123"))
			return true;
		else
			return false;
	}
}
