package com.code.ahmad.Inheritance;

public class Employee3 extends Manager{
	
	private int id;
	
	private String name;
	
	private String email;
	
	public int getId() {
		return id;
	}

	public int setId() {
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

	// Overriding methods from super class giving own implementation	
	@Override
	public void myDetail() {
		System.out.println("I am Employee3:\nMy id is:"+id+ "\nMy name is:"+name+"\nMy Email is:"+email);
	}
	
	@Override
	public void schedule(String [] days) {
		System.out.println("I am Employee 4 my schedule this week is:");
		for (String z : days) {
			System.out.println(z);
		}
;
	}
}