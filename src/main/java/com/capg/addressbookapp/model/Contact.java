package com.capg.addressbookapp.model;

import com.capg.addressbookapp.dto.ContactDTO;

public class Contact {

	private int id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
