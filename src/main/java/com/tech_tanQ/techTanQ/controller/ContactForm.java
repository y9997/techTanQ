package com.tech_tanQ.techTanQ.controller;

public class ContactForm {
	private String name;
    private String email;
    private String message;

    // ゲッター
    public String getName() {
    	return name; 
    }
    public String getEmail() {
        return email;
    }
    public String getMessage() {
        return message;
    }

    //セッター
    public void setName(String name) {
    	this.name = name; 
    }
    public void setEmail(String email) {
    	this.email = email; 
    }
    public void setMessage(String message) {
    	this.message = message; 
    }
}
