package com.capg.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;

public class ContactDTO {

	@NotEmpty(message = "ID cannot be empty")
	public Long id;
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	@NotEmpty(message = "ZIP code is required")
	public String zip;
	@NotEmpty(message = "Phone number cannot be empty")
	public long phoneNumber;
	public String email;
}
