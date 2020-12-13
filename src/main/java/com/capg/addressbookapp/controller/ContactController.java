package com.capg.addressbookapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.addressbookapp.model.Contact;

@RestController
public class ContactController {

	List<Contact> contacts = new ArrayList<>();
	
	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAllContacts() {
		return new ResponseEntity<>(contacts, HttpStatus.OK);
	}
	
	@GetMapping("/contact/{id}")
	public ResponseEntity<Contact> getContact(@PathVariable int id) {
			return new ResponseEntity<>(contacts.get(id), HttpStatus.OK);
		}
	
	@PostMapping("/contact")
	public void addContact(@RequestBody Contact contact) {
		contacts.add(contact);
	}
	
	@PutMapping("/contact/{id}")
	public void updateContact(@PathVariable Long id, @RequestBody Contact contact) {
		contacts.stream().filter(c -> c.getId().equals(id)).findFirst();
	}
	
	@DeleteMapping("contact/{id}")
	public void deleteContact(@PathVariable int id) {
		contacts.remove(id);
	}
}

