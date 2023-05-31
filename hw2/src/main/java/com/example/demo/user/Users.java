package com.example.demo.user;

import java.sql.Date;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Users {
	@Id
	@SequenceGenerator(
			name="users_sequence",
			sequenceName="users_sequence",
			allocationSize=1
			
			)
	@GeneratedValue(
			strategy=GenerationType.IDENTITY,
			generator="users_sequence"
			)
	private Long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String gender;
	private Float weight;
	private Float height;
	private Date C_date;
	private Float Index_Result;
	private String Index_Range;
	
	public Users() {
		
	}


public Users(Long id, String firstName, String lastName,Date dateOfBirth, String gender, Float weight,
			Float height, Date C_date , Float Index_Result, String Index_Range) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.C_date = C_date;
		this.Index_Result = Index_Result;
		this.Index_Range = Index_Range;
		
	}

public Users(String firstName, String lastName, Date dateOfBirth, String gender, Float weight,
		Float height, Date C_date , Float Index_Result, String Index_Range) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.weight = weight;
	this.height = height;
	this.C_date = C_date;
	this.Index_Result = Index_Result;
	this.Index_Range = Index_Range;
}



public Users(String firstName, Date c_date) {
	super();
	this.firstName = firstName;
	C_date = c_date;
}


public Date getC_date() {
	return C_date;
}


public void setC_date(Date c_date) {
	C_date = c_date;
}


public Float getIndex_Result() {
	return Index_Result;
}


public void setIndex_Result(Float index_Result) {
	Index_Result = index_Result;
}


public String getIndex_Range() {
	return Index_Range;
}


public void setIndex_Range(String index_Range) {
	Index_Range = index_Range;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public Users(String firstName, String lastName, Date dateOfBirth, String gender, Float weight, Float height) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.weight = weight;
	this.height = height;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public Date getDateOfBirth() {
	return dateOfBirth;
}


public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public Float getWeight() {
	return weight;
}


public void setWeight(Float weight) {
	this.weight = weight;
}


public Float getHeight() {
	return height;
}


public void setHeight(Float height) {
	this.height = height;
}


@Override
public String toString() {
	return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
			+ ", gender=" + gender + ", weight=" + weight + ", height=" + height + ", C_date=" + C_date
			+ ", Index_Result=" + Index_Result + ", Index_Range=" + Index_Range + "]";
}












	

}
