package com.blogs.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blogs.dto.CategoryDTO;
import com.blogs.entities.Category;

@SpringBootTest
//annotation for the spring boot to enable all spring bean  controller service dao db

class CategoryServiceTest {
	@Autowired
	private CategoryService categoryService;
	
	@Test
	void test() {
		assertNotNull(categoryService);
	}
	@Test
	void testGetAllCategories() {
		List<CategoryDTO> list = categoryService.getAllCategories();
		assertEquals(4,list.size());
		list.forEach();
	


}
