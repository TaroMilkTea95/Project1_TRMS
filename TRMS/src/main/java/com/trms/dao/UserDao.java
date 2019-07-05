package com.trms.dao;

import java.util.ArrayList;
import java.util.List;

import com.trms.pojos.User;

public interface UserDao {
	
	public User getUserByUsername (String username);
	
	public ArrayList<User> getAllUsers ();
	
	
}
