package com.example.demo.user;

import java.time.LocalDate;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private final UserRepository sr;
	
	@Autowired
	public UserService(UserRepository sr) {
		this.sr=sr;
	}

	public List<Users> getUsers() {
		System.out.println("of");
		return sr.findAll();
	} 
	
	public Users getUser(Long id) {
		Users us1=sr.findUserByID(id).get();
		return us1;
	}
	public List<Users> filterUsers(String name, Date Cdate) {
		List<Users> us=sr.findUsersByNameOrDate(name, Cdate).get();
		return  us;
	}
	
	public Users addNewUser(Users user) {
		return sr.save(user);
	}
	
}
