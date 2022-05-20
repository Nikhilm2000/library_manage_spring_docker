package com.demo.librarymanagementsystem.entity;




//insert into publisher_contact values(6,'bookdiya@gmail.com',3546578779,6);
public class Contact {
	
	private Long Id;

    private String email;

    private Long phone;
	
	private Long pub_id;
	
	public Contact(Long id, String email, Long phone, Long pub_id) {
		super();
		Id = id;
		this.email = email;
		this.phone = phone;
		this.pub_id = pub_id;
	}
	public Contact() {
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Long getPub_id() {
		return pub_id;
	}
	public void setPub_id(Long pub_id) {
		this.pub_id = pub_id;
	}
	
}
