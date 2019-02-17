package com.jzzx.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jzzx.models.User;
import com.jzzx.repository.UserDao;
import com.jzzx.repository.UserRepository;
import com.jzzx.services.UserManagerService;
/**
 * 
 * @author itxin
 * @description 用户管理业务逻辑层
 */
@Service
public class UserManagerServiceImpl implements UserManagerService {
	
	@Autowired
	private UserRepository usersRepository;
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUserByName(String name) {
		return usersRepository.getUserByName(name);
	}

	@Override
	public User getUserByNameAndPassword(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>)usersRepository.findAll();
	}
	/**
	 * 修改
	 */
	@Transactional
	@Override
	public void updateUserById(String name, String password, int id) {
		
		usersRepository.updateUserById(name, password, id);
	}

	@Override
	public int addUser(String name, String password) {
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		return userDao.addUser(user);
	}
	
	
	
}
