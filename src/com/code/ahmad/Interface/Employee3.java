package com.code.ahmad.Interface;

public class Employee3 implements Manager {

	private int id;

	private String name;

	private String email;

	private int numberOfHours;

	public Employee3() {

	}

	// constructor
	public Employee3(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	// Implementing method from ceo interface
	@Override
	public void calculatePay(int numberOfHours) {
		
		// we can access base pay from ceo it can not be changed its final
		int pay=numberOfHours*basePay;
		System.out.println("I am employee 3 my name is "+name+
				"i Worked "+numberOfHours+" this week so my pay is: "+pay+"\n as base pay from ceo is: "
				+basePay);

	}

	// Implementing method from manager interface
	@Override
	public void getTask() {
		System.out.println("I am employee 3 my name is "+name
				+ " My task is to design spring MVC app using java configuration");
	}
	
	@Override
	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + ", email=" + email + ", numberOfHours=" + numberOfHours + "]";
	}

}
