package com.doosan.sddms.user.domain;

import lombok.Data;

public @Data class User {
	private String user_name;
	private String user_password;
	private String emp_nm;
	private String org_id;
}
