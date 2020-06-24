package com.code.ahmad.Inheritance;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {

		// Number of days allowed to work
		int managerDays=6;
		int employee1Days=5;
		int employee2Days=4;
		int employee3Days=3;
		
		String [] managerSec= new String [managerDays];
		String [] employee1Sec= new String [employee1Days];
		String [] employee2Sec= new String [employee2Days];
		String [] employee3Sec= new String [employee3Days];
		// Creating scanner to get input from user
		Scanner scanner = new Scanner(System.in);
		
		// Creating objects of classes
		Manager manager = new Manager();
		Employee1 employee1 = new Employee1();
		Employee2 employee2 = new Employee2();
		Employee3 employee3 = new Employee3();
//=========================================================//
		// Getting id from user and setting it using setters
		System.out.println("Please enter manager Id");
		int managerId = scanner.nextInt();
		manager.setId(managerId);

		System.out.println("Please enter employee1 Id");
		int employee1Id = scanner.nextInt();
		employee1.setId(employee1Id);

		System.out.println("Please enter employee2  Id");
		int employee21Id = scanner.nextInt();
		employee2.setId(employee21Id);

		System.out.println("Please enter employee3 Id");
		int employee3Id = scanner.nextInt();
		employee3.setId(employee3Id);
		scanner.nextLine();
//==========================================================//

		// Getting name from user and setting user setters
		System.out.println("Please enter manager name");
		String managerName = scanner.nextLine();
		manager.setName(managerName);

		System.out.println("Please enter employee1 name");
		String employee1Name = scanner.nextLine();
		employee1.setName(employee1Name);

		System.out.println("Please enter employee2 name");
		String employee2Name = scanner.nextLine();
		employee2.setName(employee2Name);

		System.out.println("Please enter employee3 name");
		String employee3Name = scanner.nextLine();
		employee3.setName(employee3Name);
//===========================================================//
		
		// Getting email from user and setting it using setters
		System.out.println("Please enter manager email");
		String managerEmail = scanner.nextLine();
		manager.setEmail(managerEmail);

		System.out.println("Please enter employee1 email");
		String employee1Email = scanner.nextLine();
		employee1.setEmail(employee1Email);

		System.out.println("Please enter employee2 email");
		String employee2Email = scanner.nextLine();
		employee2.setEmail(employee2Email);

		System.out.println("Please enter employee3 email");
		String employee3Email = scanner.nextLine();
		employee3.setEmail(employee3Email);
//===========================================================//

		System.out.println("Please select your schedule Manager:");
				
		for(int i=0; i<managerDays; i++) {
			managerSec[i]=scanner.nextLine();
		}
		
		System.out.println("Please select your schedule Employee1:");
		
		for(int i=0; i<employee1Days; i++) {
			employee1Sec[i]=scanner.nextLine();
		}
		
		System.out.println("Please select your schedule Employee2:");
		
		for(int i=0; i<employee2Days; i++) {
			employee2Sec[i]=scanner.nextLine();
		}
		
		System.out.println("Please select your schedule Employee3:");
		
		for(int i=0; i<employee3Days; i++) {
			employee3Sec[i]=scanner.nextLine();
		}		
		
		manager.myDetail();
		employee1.myDetail();
		employee2.myDetail();
		employee3.myDetail();
		manager.schedule(managerSec);
		employee1.schedule(employee1Sec);
		employee2.schedule(employee2Sec);
		employee3.schedule(employee3Sec);
	}
}
