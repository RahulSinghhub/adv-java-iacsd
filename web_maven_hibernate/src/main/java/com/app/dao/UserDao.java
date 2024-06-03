package com.app.dao;

import java.sql.Date;
import java.util.List;

import com.app.entities.User;

public interface UserDao {
	User signIn(String email, String password) ;
	

}
