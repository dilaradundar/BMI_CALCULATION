package com.example.demo.user;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(path="api/v1/users",method= {RequestMethod.GET,RequestMethod.POST})
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) { //UserServicedeki Service ile çalışıyor.
		this.userService=userService;
	}
	
	
	@GetMapping(path="get")
	public ModelAndView getUsers() {
		System.out.println("cont");
		ModelAndView view1=new ModelAndView("filter.html");
		view1.addObject("Users",userService.getUsers());
		return view1;
		
	}
	
	
	@PostMapping(path="calindex")
	public ModelAndView addUsers() {
		ModelAndView mav1 = new ModelAndView("calculate.html");
		return mav1;
	}
	
	@PostMapping(path="cal")
	public ModelAndView addUsers(Users user) {
		userService.addNewUser(user);
		//ModelAndView mav1 = new ModelAndView("calculate.html");
		System.out.println(user.getId());
		String id=Long.toString(user.getId());
		return new ModelAndView("redirect:/api/v1/users/user/"+id);
		
	}
	
	@GetMapping(path="/user/{userId}")
	public ModelAndView getUsers(@PathVariable("userId")Long userId) {
		ModelAndView view1=new ModelAndView("listUser.html");
		view1.addObject("Users",userService.getUser(userId));
		return view1;
		
	}
	
	@GetMapping(path="filter")
	public ModelAndView filterUsers(Users user) {
		String name=user.getFirstName();
		Date date=user.getC_date();
		System.out.println(user.getFirstName());
		System.out.println(user.getC_date());
		
		ModelAndView mav = new ModelAndView("filter.html");
		mav.addObject("Users",userService.filterUsers(name,date));
		return mav;
		
	}
	
	
	
	
	
}
