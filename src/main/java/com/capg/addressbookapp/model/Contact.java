package com.capg.addressbookapp.model;

import com.capg.addressbookapp.dto.ContactDTO;

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
	
	public Contact(ContactDTO contactdto) {
		super();
		this.id = contactdto.id;
		this.firstName = contactdto.firstName;
		this.lastName = contactdto.lastName;
		this.address = contactdto.address;
		this.city = contactdto.city;
		this.state = contactdto.state;
		this.zip = contactdto.zip;
		this.phoneNumber = contactdto.phoneNumber;
		this.email = contactdto.email;
	}
	
}
