package com.capg.addressbookapp.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.addressbookapp.model.Contact;

@Service
public class ContactServiceImpl implements IContactService {

	List<Contact> contacts = new LinkedList<>();

	@Override
	public void addContact(int id, Contact contact) {
			contacts.add(id, contact);
	}

	@Override
	public Contact getContact(int id) {
		return contacts.get(id);
	}

	@Override
	public List<Contact> getAllContacts() {
		return contacts;
	}

	@Override
	public void updateContact(int id, Contact contact) {
		Contact contactTemp = getContact(id);
		if (contactTemp != null) {
			contacts.set(id, contact);
		}
	}

	@Override
	public void deleteContact(int id) {
		contacts.remove(id);
	}

}
