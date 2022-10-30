package com.contact.repositary;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.model.Contact;

public interface ContactRepositary extends JpaRepository<Contact, Serializable> {

}
