package com.capg.addressbookapp.service;

import java.util.List;

import com.capg.addressbookapp.model.Contact;

public interface IContactService {

	public void addContact(int id, Contact contact);
	public Contact getContact(int id);
	public List<Contact> getAllContacts();
	public void updateContact(int id, Contact contact);
	public void deleteContact(int id);
}
