package com.app.springmvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName,lastName,country,favoriteLanguage;
	private LinkedHashMap<String, String> countryOptions;
	private String[] operatingSystems;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("US", "USA");
		countryOptions.put("UK", "UK");
		countryOptions.put("USSR", "Russia");
		countryOptions.put("IC", "Iceland");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
