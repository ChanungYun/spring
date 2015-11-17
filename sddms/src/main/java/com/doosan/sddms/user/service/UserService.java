package com.doosan.sddms.user.service;

import com.doosan.sddms.user.domain.User;

public interface UserService {
	
	public User readOneUser(String username);
	public void createUser(User user);
}
