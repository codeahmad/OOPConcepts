package com.code.ahmad.Abstraction;

public class Employee3 extends Ceo {

	private int id;

	private String name;

	private String email;

	private int numberOfHour;

	private int revenue;

	public Employee3() {

	}

	// I will take revenue and numberOFHour from user thats why they are not in constructor 
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

	public int getNumberOfHour() {
		return numberOfHour;
	}

	public void setNumberOfHour(int numberOfHour) {
		this.numberOfHour = numberOfHour;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	@Override
	public void calculateBonus() {
		if (numberOfHour >= 1500 && revenue >= 100000) {
			System.out.println("You are promoted" + "You bonuus is:10,000");
		} else if (numberOfHour < 1500 && numberOfHour > 1100 && revenue >= 70000) {
			System.out.println("You are promoted" + "You bonuus is:7,000");
		} else if (numberOfHour < 1100 && numberOfHour > 700 && revenue >= 50000) {
			System.out.println("You are promoted" + "You bonuus is:5,000");
		} else {
			System.out.println("Sorry you are not entitled for bonus");
		}

	}

	@Override
	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + ", email=" + email + ", numberOfHour=" + numberOfHour
				+ ", revenue=" + revenue + "]";
	}

}