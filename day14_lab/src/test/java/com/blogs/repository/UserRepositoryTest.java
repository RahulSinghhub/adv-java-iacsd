package com.blogs.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.blogs.entities.User;

@DataJpaTest //annotation to tell spring boot test framework to enable data
//jpa layer ie sevice | controller | 
//modelmapper .. beans will not be avtivated
//
@AutoConfigureTestDatabase(replace = Replace.NONE)
//tells spring boot test framework waht to replace the original database 
class UserRepositoryTest {
//can wrtite multiple test method
	@Autowired
	private UserRepository userRepository;
	
	
	@Test // tells a test method
	void testFindByEmailAndPassword() {
		Optional<User> optional =  userRepository.findByEmailAndPassword("a2@gmail.com","2234");
		//asserts method arguments 1 st arg = exp   2 is actual
		//assertions has assert method 
		assertEquals(2l, optional.get().getId());
	}

}
