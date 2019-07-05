package com.trms.services;

import com.trms.connections.LoggingUtil;
import com.trms.dao.UserDaoImpl;
import com.trms.pojos.User;

public class UserServiceImpl implements UserService {

	private static UserDaoImpl udi = new UserDaoImpl();

	@Override
	public User loginUser(String username, String password) {
		LoggingUtil.trace("username: " + username);
		LoggingUtil.trace("password: " + password );

		User user = null;
		for (User check : udi.getAllUsers()) {
			if(check.getUsername().equals(username) && check.getPassword().equals(password)) {
				user = check;
				break;
			}
		}
		return user;
	}

	@Override
	public User getAllUsers(String username) {
		return udi.getUserByUsername(username);
	}
}
