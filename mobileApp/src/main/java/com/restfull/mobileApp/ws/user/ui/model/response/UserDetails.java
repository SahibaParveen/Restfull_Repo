package com.restfull.mobileApp.ws.user.ui.model.response;

public class UserDetails {
	
	
	private String name;
	private int contact;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", contact=" + contact + "]";
	}	
}
