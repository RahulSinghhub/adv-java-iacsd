package com.blogs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    //add a derived finder method for user sign in
	Optional<User> findByEmailAndPassword(String em,String pass);//instead optional we can use it by optioal but if user is returned we get null checking
	
	
}
