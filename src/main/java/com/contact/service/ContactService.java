package com.contact.service;

import java.util.List;

import com.contact.model.Contact;

public interface ContactService {
	
	public boolean contactCreate(Contact contact);
	
	public List<Contact> contacts();
	
	public Contact contact(Integer contId);
	
	public boolean contactDelete(Integer contId);

}
