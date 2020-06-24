package com.code.ahmad.Inheritance;

import java.util.ArrayList;

public class Manager {

	private int id;

	private String name;

	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void myDetail() {
		System.out.println("I am Manager:\nMy id is:" + id + "\nMy name is:" + name 
				+ "\nMy Email is:" + email);
	}

	public void schedule(String[] days) {
		System.out.println("I am manager my schedule this week is:");
		for (String z : days) {
			System.out.println(z);
		}

	}
}