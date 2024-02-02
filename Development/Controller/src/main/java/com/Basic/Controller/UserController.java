
package com.Basic.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Basic.Entity.User;
import com.Basic.Service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/isActive")
	public String Checkup()
	{
		return "working";
	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<?> saveUser(@RequestBody User userDetails)
	{
		System.out.println("user creation");
		return userService.saveUser(userDetails);
	}
	
	/*@PostMapping("/dologin")
	public ResponseEntity<?> doLogin(@RequestBody User userDetails,HttpServletRequest request)
	{
		return userService.doLogin(userDetails,request);
	}*/
	
	
}
