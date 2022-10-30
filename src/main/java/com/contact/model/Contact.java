package com.contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT_MASTER")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CONT_ID")
	private Integer contId;
	
	@Column(name = "CONT_NAME")
	private String contName;
	
	@Column(name = "CONT_EMAIL")
	private String contEmail;
	
	@Column(name = "CONT_MOBILE")
	private String contMobile;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "ADDRESS")
	private String address;

	public Integer getContId() {
		return contId;
	}

	public void setContId(Integer contId) {
		this.contId = contId;
	}

	public String getContName() {
		return contName;
	}

	public void setContName(String contName) {
		this.contName = contName;
	}

	public String getContEmail() {
		return contEmail;
	}

	public void setContEmail(String contEmail) {
		this.contEmail = contEmail;
	}

	public String getContMobile() {
		return contMobile;
	}

	public void setContMobile(String contMobile) {
		this.contMobile = contMobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
