package com.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.model.Contact;
import com.contact.repositary.ContactRepositary;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepositary contactRepositary;

	@Override
	public boolean contactCreate(Contact contact) {
		
		return contactRepositary.save(contact).getContId()!=null;
	}

	@Override
	public List<Contact> contacts() {
		
		return contactRepositary.findAll();
	}

	@Override
	public Contact contact(Integer contId) {
		Optional<Contact> findById = contactRepositary.findById(contId);
		if(findById.isPresent()) {
			Contact contact = findById.get();
			return contact;
		}
		return null;
	}

	@Override
	public boolean contactDelete(Integer contId) {
		contactRepositary.deleteById(contId);
		return true;
	}

}
