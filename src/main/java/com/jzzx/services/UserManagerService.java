package com.jzzx.services;

import java.util.List;

import com.jzzx.models.User;

public interface UserManagerService {

	public List<User> getUserByName(String name);
	 
	public User getUserByNameAndPassword(String name,String password);
 
	public User getUserById(int id);
	
	public List<User> findAll();
	
	public void updateUserById(String name, String password, int id);
	
	int addUser(String name, String password);
}
