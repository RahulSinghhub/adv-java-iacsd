package com.blogs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blogs.entities.Role;
import com.blogs.entities.User;
import com.blogs.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
     /*
      *request param method arg argument 
      *to binf request parameters to method args
      *done auto by sc
      * 
      * */
	public String processLoginForm(@RequestParam String email, @RequestParam String password,Model map,HttpSession session) {
		System.out.println("the process login form "+ email +" "+ password);
		try {
			User user = userService.signInUser(email, password);
			//add user details and message under model attribute
             session.setAttribute("message","login successfull");
             session.setAttribute("user_details",user);
			//in case of admin 
			//in case of blogger
			if(user.getRole()==Role.ADMIN) {
				return "redirect:/admin/home";
				//sc -- redirect whole api + url encoding 
				//next url http://localhost:8080/spring_boot/admin/home
			}
			else {
				return "redirect:/blogger/home";
				//next url http://localhost:8080/spring_boot/blogger/home
			}
		}catch(RuntimeException e) {
			System.out.println("err"+e);
			map.addAttribute("message",e.getMessage());
			return "/users/login";
		}
		
	
	}

}
