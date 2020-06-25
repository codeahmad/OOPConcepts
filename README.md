# OOPConcepts
Object oriented programming concepts such as Polymorphism, Inheritance, Encapsulation, Abstraction, Objects, Methods.

# Inheritance
To implment concept of inheritance i created a super class manager, which has its own detail and two methods called **schedule(); and myDetail();** manager has its own detail like id, name, email etc. and also has schedule() to set his schedule for the comming week. These are common traits as also required by other employees to do the same i created three classes extends manager class and inherit the methods from manager. I used scanner to take input from user for schedule() and myDetail. 

# Abstraction
To implement concept of Abastraction i created a super class ceo with have an **abstract method called calculateBonus();** which is unmeaningful to the class ceo and has no implementation, I created three sub classes of employees extends super class ceo, Emplloyees have their detail including details of revenue they generated last year, based on revenue they call this abstract method from super class ceo and calculate bonus.  I used scanner to take input from user for number of hours worked and revenue generated.

# Interface and Polymorphism 
To implement Interface along with Polymorophism i created two interfaces with the name ceo and manager ceo has one attribute called base pay which is public static final same for all employees and also have a method called calculatePay(int numberOfHors), the second interface manager also have one method called getTask();, any class implements interface manager **has to implemnt all methods** and have detail of **basePay**. I created employee class that implemented manager class since employee has manager and ceo mrthods this is also known as polymorphism one class is a member of two differnt interfaces. 
I created three sub classes which implements manager class override the methods of **manager class getTask(); and used override calculatePay()** also used **static final varible of ceo interface basePay** to calculate pay multipling it to number of hours worked in the week. I used scanner to take input from the user for number of hour worked.


# Encapsulation
Encapsulation is a process in which we wrap data and code together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding. I applied concepts of encapsulation in all above concepts, Created private variables in classes and created their getters and setters for access from other classes.   
