package com.doosan.sddms.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doosan.sddms.home.mapper.UserMapper;
import com.doosan.sddms.user.domain.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public User readOneUser(String username) {
		return userMapper.readOneUser(username);
	}

	@Override
	public void createUser(User user) {
		userMapper.createUser(user);
	}
	
}
