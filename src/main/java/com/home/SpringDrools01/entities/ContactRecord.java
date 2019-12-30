package com.home.SpringDrools01.entities;

public class ContactRecord {

	private int id;
	private String name;
	private String message;
	
	public ContactRecord() {}
	
	
	public ContactRecord(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
