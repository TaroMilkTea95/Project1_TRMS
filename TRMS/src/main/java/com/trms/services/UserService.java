package com.trms.services;

import com.trms.pojos.User;

public interface UserService {

	public User loginUser(String username, String password);
	
	public User getAllUsers(String username);
}
