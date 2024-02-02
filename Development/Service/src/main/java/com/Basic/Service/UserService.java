package com.Basic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Basic.Entity.User;
import com.Basic.Exception.ExceptionResponse;
import com.Basic.Repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepository;
	
	public ResponseEntity<?> saveUser(User userDetails)
	{
		ResponseEntity<?> responseEntity =null;
		ExceptionResponse exceptionResponse=null;
		
		System.out.println("hello");
		
		User  newUser = userRepository.save(userDetails);
		
		if(newUser !=null)
		{
			exceptionResponse= new ExceptionResponse("User Created ","Success");
			
			responseEntity= new ResponseEntity<Object>(exceptionResponse,HttpStatus.OK);
		}
		
		
		return responseEntity;
		
	}
	
	
}
