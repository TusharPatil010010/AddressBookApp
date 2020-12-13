package com.capg.addressbookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.addressbookapp.dto.ContactDTO;
import com.capg.addressbookapp.model.Contact;
import com.capg.addressbookapp.service.ContactServiceImpl;

@RestController
public class ContactController {
	
	@Autowired
	private ContactServiceImpl contactService;
	
	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAllContacts() {
		return new ResponseEntity<>(contactService.getAllContacts(), HttpStatus.OK);
	}
	
	@GetMapping("/contact/{id}")
	public ResponseEntity<Contact> getContact(@PathVariable int id) {
		return new ResponseEntity<>(contactService.getContact(id), HttpStatus.OK);
	}
	
	@PostMapping("/contact")
	public void addContact(@RequestBody ContactDTO contactdto) {
		Contact contact = new Contact(contactdto);
		contactService.addContact(contactdto.id, contact);
	}
	
	@PutMapping("/contact/{id}")
	public void updateContact(@PathVariable int id, @RequestBody ContactDTO contactdto) {
		Contact contact = new Contact(contactdto);
		contactService.updateContact(id, contact);
	}
	
	@DeleteMapping("contact/{id}")
	public void deleteContact(@PathVariable int id) {
		contactService.deleteContact(id);
	}
}

