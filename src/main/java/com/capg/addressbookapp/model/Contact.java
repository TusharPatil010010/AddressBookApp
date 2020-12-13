package com.capg.addressbookapp.model;

import lombok.Data;

public @Data class Contact {

	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private long phoneNumber;
	private String email;
	
	public Contact(Long id, String firstName, String lastName, String address, String city, String state, String zip,
			long phoneNumber, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
}
