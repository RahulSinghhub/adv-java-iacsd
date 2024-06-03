package com.blogs.service;

import com.blogs.entities.User;

public interface UserService {
	User signInUser(String email,String pwd);

}
