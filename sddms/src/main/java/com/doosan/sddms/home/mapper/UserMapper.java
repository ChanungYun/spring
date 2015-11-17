package com.doosan.sddms.home.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.doosan.sddms.user.domain.User;

public interface UserMapper {
	
	@Select("SELECT user_name, user_password " +
			"FROM users WHERE user_name = #{username}")
	public User readOneUser(String username);
	
	@Insert("INSERT INTO users " + 
			"VALUES (#{user_name}, #{user_password}, #{emp_nm}, #{org_id})")
	public void createUser(User user);
}
