package com.code.ahmad.Interface;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
	
		// Creating instance of employees
		Employee1 employee1= new Employee1(1,"Zubair","zubair@yahoo.com");
		Employee2 employee2= new Employee2(2,"John", "john@gmail.com");
		Employee3 employee3= new Employee3(3,"Mary","mary@hotmail.com");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter hours worked this week for employee 1");
		employee1.setNumberOfHours(scanner.nextInt());
		
		System.out.println("Please enter hours worked this week for employee 2");
		employee2.setNumberOfHours(scanner.nextInt());
				
		
		System.out.println("Please enter hours worked this week for employee 3");
		employee3.setNumberOfHours(scanner.nextInt());	

		System.out.println("Employee 1 \n"+employee1+"\n");
		employee1.getTask();
		employee1.calculatePay(employee1.getNumberOfHours());
		
		System.out.println("Employee 2 \n"+employee2+"\n");
		employee2.getTask();
		employee2.calculatePay(employee2.getNumberOfHours());
		
		System.out.println("Employee 1 \n"+employee2+"\n");
		employee3.getTask();
		employee3.calculatePay(employee3.getNumberOfHours());
	}
}
