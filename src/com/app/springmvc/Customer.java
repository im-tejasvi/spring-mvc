package com.app.springmvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.app.springmvc.validation.CourseCode;

public class Customer {

	private String firstName;

	@NotNull(message = " is required!")
	@Size(min = 1, message = " is required!")
	private String lastName;
	
	@CourseCode(value = "CC", message = " must start with CC !")
	private String courseCode;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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
	
	
}
