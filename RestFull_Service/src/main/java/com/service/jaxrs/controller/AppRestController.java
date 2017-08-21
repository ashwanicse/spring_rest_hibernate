package com.service.jaxrs.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*import com.service.jaxrs.dao.UserDAO;*/
import com.service.jaxrs.model.User;



@RestController
public class AppRestController {
	/*
	@Autowired
	UserDAO userDAO;*/

	@Autowired
	User user;
	
	List<User> list;
	

	public AppRestController() {
		list=new ArrayList<User>();
		list.add(new User(123,"amit","amit@gmail.com","a123"));
		list.add(new User(124,"Sumit","sumit@gmail.com","s123"));
		list.add(new User(125,"kiran","kiran@outlook.com","k123"));
	}
	
	private User findUserByID(String userID){
		Iterator<User> itr=list.iterator();
		while(itr.hasNext()){
			User user=(User)itr.next();
			if(userID.equals(user.getUserID()))
			   return user;
		}
		return null;
	}

/*	@RequestMapping("/")
	public String welcome(){
		return "Welcome to First Restful web Service";
	}
	*/
	
	
	@RequestMapping(value="/user/",method=RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUser(){
		
		/*if(userDAO.getAllUser().isEmpty())*/
			if(list.isEmpty())
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		else{
			//List<User> list=userDAO.getAllUser();
			return new ResponseEntity<List<User>>(list,HttpStatus.OK);
		}
	}
	

	/*@GetMapping(value="/user/{userID}")
	public ResponseEntity<User> getUser(@PathVariable("userID") long userID){
		   User user=userDAO.getUser(userID);
		   if(user==null)
			     return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		 	
	}
	

	@PostMapping(value="/user/")
	public ResponseEntity<Void> createUser(@RequestBody User user){
		if(userDAO.createUser(user)==true){
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		else
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		
	}

	@DeleteMapping("/user/{userID}")
	public ResponseEntity<User> deleteUser(@PathVariable("userID") long userID){
		 User user=userDAO.getUser(userID);
		   if(user==null)
			     return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		     userDAO.deleteUser(user);
			 return new ResponseEntity<User>(HttpStatus.NO_CONTENT);		
	}
	
	@DeleteMapping("/user/")
	public ResponseEntity<User> deleteAllUser(){
		userDAO.deleteAllUser();
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	*/
}
