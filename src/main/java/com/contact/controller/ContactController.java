package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.contact.constant.AppConstant;
import com.contact.model.Contact;
import com.contact.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping(value = { "/", "/home" })
	public String loadHomePage(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "home";
	}

	@PostMapping("/scontact")
	public String createContact(Contact contact, Model model) {
		boolean contactCreate = contactService.contactCreate(contact);
		if (contactCreate) {
			model.addAttribute(AppConstant.CREATE_CONTACT, contactCreate);
		} else {
			model.addAttribute(AppConstant.CREATE_CONTACT_FAILED, contactCreate);
		}

		return "redirect:registersucess";
	}

	@GetMapping("/contacts")
	public String contacts(Model model) {
		List<Contact> contacts = contactService.contacts();
		if (contacts != null) {
			model.addAttribute("contacts", contacts);
		}
		return "contact_list";
	}

	@GetMapping("/registersucess")
	public String registerSuccess(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "home";

	}
	
	public String updateContact() {
		
		return "home";
	}

}
