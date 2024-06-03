package com.blogs.service;

import com.blogs.dto.AuthDto;
import com.blogs.dto.UserRespDto;

public interface UserService {

	UserRespDto authenticateUser(AuthDto dto);
	

}
