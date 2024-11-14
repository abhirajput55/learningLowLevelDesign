package com.concepts;

public class J1_SolidPrincipal {
	
/* 1. Single Responsibility Principle (SRP) */
	
//	A class should have only one reason to change, meaning it should have only one job or responsibility.
	
//	When a class has more than one responsibility, it becomes harder to change and maintain. 
//	If you have to make changes to one responsibility, then other responsibilities may affect.
//	Hence SRP says each class has a single responsibility.
	
//	Example:
//	Imagine you're building a system to manage employee records. 
//	Instead of having one class handle both employee details and printing reports, you split these responsibilities.
	
	
	//Violating SRP: One class handles both employee details and report generation.
	class Employee {
		
		private int empId;
		private String empName;
		
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
		
		public void printEmployeeReport() {
			System.out.println("Employee " + empName + " with id " + empId + " report printing.");
		}
	}

	// Corrected for SRP:
	class Employee1 {
		
		private int empId;
		private String empName;
		
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		
		public void setEmpName(String empName) {
			this.empName = empName;
		}
	}

	class ReportPrinter {
		
		public void printEmployeeReport(Employee1 employee) {
//			System.out.println("Employee " + employee.getEmpName + " with id " + employee.getEmpId + " report printing.");
		}
	}
	
//	In the corrected example, Employee only focuses on storing employee data, 
//	while ReportPrinter handles the printing task. Each class has one responsibility.
	
//	OOP Concept: Separation of Concerns
//	SRP encourages modularity. Each class is now focused on a single responsibility, making it easier to modify and maintain.
	
	
//==========================================================================================================================================

	
/* 2. Open/Closed Principle (OCP) */
	
//	Software entities (classes, modules, functions) should be open for extension but closed for modification.
	
//	This principle means that you should be able to extend a class's behavior without modifying its existing code. 
//	Instead of altering a class, you create new classes or interfaces that build upon it.
	
//	Example:
//	Imagine a scenario where you are building a system to calculate the area of different shapes (like a circle and a rectangle). 
//	Instead of modifying the AreaCalculator class every time you add a new shape, you can extend it.
	
	// Violating OCP: Changing the existing class for each new shape.
	class AreaCalculator {
		
		public double calculateArea(Object shape) {
			
			if(shape instanceof Circle) {
				return Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
			}
			else if(shape instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) shape;
				return rectangle.getLength() * rectangle.getWidth();
			}
			
			return 0.0;
		}
	}
	
	class Circle {
		private double radius;
		
		public double getRadius() {
			return this.radius;
		}
	}
	
	class Rectangle {
		private double length;
		private double width;
		
		public double getLength() {
			return this.length;
		}
		
		public double getWidth() {
			return this.width;
		}
	}
	
	// Corrected for OCP: Adding new shapes without modifying the AreaCalculator.
	interface Shape {
		double calculateArea();
	}
	
	class Circle1 implements Shape {
		private double radius;
		
		public double getRadius() {
			return this.radius;
		}

		@Override
		public double calculateArea() {
			return Math.PI * Math.pow(this.radius, 2);
		}
	}
	
	class Rectangle1 implements Shape {
		private double length;
		private double width;
		
		public double getLength() {
			return this.length;
		}
		
		public double getWidth() {
			return this.width;
		}

		@Override
		public double calculateArea() {
			return this.length * this.width;
		}
	}
	
	class AreaCalculator1 {
		
		public double areaCalculator(Shape shape) {
			return shape.calculateArea();
		}
	}
	
//	Now, when you want to add a new shape, you can do so without changing the AreaCalculator class. 
//	You simply create a new class that implements the Shape interface.
	
//	OOP Concept: Abstraction & Polymorphism
//	We use interfaces to abstract the shape calculation logic. Polymorphism allows us to treat all shapes as 
//	objects of type Shape and call their respective calculateArea() method.

//==========================================================================================================================================

	
/* 3. L - Liskov Substitution Principle (LSP) */
	
//	Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.	
	
	class Bird {
		public void fly() {
			System.out.println("Flying");
		}
	}
	
	class Sparrow extends Bird {
		public void fly() {
			System.out.println("Sparrow Flying");
		}
	}
	
	class Ostrich extends Bird {
		public void fly() {
			throw new UnsupportedOperationException("Ostriches can't fly");
		}
	}
	
//	Here, Ostrich breaks the LSP because we expect all birds to be able to fly(), but Ostrich can't.

	class Bird1 {
		public void move() {
			System.out.println("Moving");
		}
	}
	
	class Sparrow1 extends Bird1 {
		public void fly() {
			System.out.println("Sparrow Flying");
		}
	}
	
	class Ostrich1 extends Bird1 {
		public void fly() {
			System.out.println("Ostrich Runnning");
		}
	}
	
//	Now, all subclasses of Bird can move, but each in their own way, ensuring that 
//	we can substitute a Bird with any subclass without unexpected behavior.
	
//	OOP Concept: Inheritance & Polymorphism
//	The principle ensures that inheritance hierarchies are designed in a way that subclasses behave 
//	in a manner consistent with their parent class.
	

//==========================================================================================================================================

	
/* 4. I - Interface Segregation Principle (ISP) */
	
//	A client should not be forced to implement interfaces it doesn’t use. 
//	Instead of one large interface, many smaller and more specific interfaces should be preferred.
	
//	Example:
//	Let's say we have a large interface for various bird behaviors:
	
	interface Birds {
		
		void fly();
		void swim();
		void run();
	}
	
	class Sparrows implements Birds {

		@Override
		public void fly() {
			System.out.println("Sparrow Flying");
		}

		@Override
		public void swim() {
			// Not needed for sparrow
		}

		@Override
		public void run() {
			System.out.println("Sparrow Running");
		}
	}
	
	class Penguin implements Birds {

		@Override
		public void fly() {
			// Not needed for Penguin
		}

		@Override
		public void swim() {
			System.out.println("Penguin swimming");
		}

		@Override
		public void run() {
			System.out.println("Penguin Running");
		}
	}
	
//	Both Sparrow and Penguin are forced to implement methods they don’t need.
	
	interface Flyable {
		void fly();
	}
	
	interface Swimmable {
		void swim();
	}
	
	interface Runnable {
		void run();
	}
	
	class Sparrows1 implements Flyable, Runnable {

		@Override
		public void run() {
			System.out.println("Sparrow Running");
		}

		@Override
		public void fly() {
			System.out.println("Sparrow Flying");
		}	
	}
	
	class Penguin1 implements Swimmable, Runnable {

		@Override
		public void run() {
			System.out.println("Penguin Running");
		}

		@Override
		public void swim() {
			System.out.println("Penguin swimming");
		}
		
	}
	
//	Now, each class only implements the methods that are relevant to its behavior.
//
//	OOP Concept: Interface Segregation & Composition
//	ISP promotes designing smaller, more focused interfaces that help maintain flexibility and reduce unnecessary coupling.

	
//==========================================================================================================================================

	
/* 5. D - Dependency Inversion Principle (DIP) */
	
//	High-level modules should not depend on low-level modules. Both should depend on abstractions. 
//	Also, abstractions should not depend on details. Details should depend on abstractions.
	
//	Example:
//	Consider the following class that directly creates a FileManager:
	
	class ReportManager {
		private FileManager fileManager = new FileManager();
		
		public ReportManager(FileManager fileManager) {
			this.fileManager = fileManager;
		}
		
		public void generateReport() {
	        fileManager.writeToFile("Report content");
	    }
	}
	
	class FileManager {
		public void writeToFile(String content) {
			System.out.println("Writing to file :: " + content);
		}
	}
	
//	Here, ReportGenerator is tightly coupled to FileManager, making it hard to switch to a different file management system.
	
	interface FileWriter {
		void write(String content);
	}
	
	class FileManager1 implements FileWriter {

		@Override
		public void write(String content) {
			System.out.println("Writing to file :: " + content);
		}
	} 
	
	class DatabaseManager1 implements FileWriter {

		@Override
		public void write(String content) {
			System.out.println("Writing to database :: " + content);
		}
	} 
	
	class ReportManager1 {
		private FileWriter fileWriter;
		
		public ReportManager1(FileWriter fileWriter) {
			this.fileWriter = fileWriter;
		}
		
		public void generateReport(String content) {
			fileWriter.write(content);
		}
	}
	
	
//	Now, ReportGenerator depends on the FileWriter abstraction, not on a concrete FileManager. 
//	We can easily inject different file-writing implementations (like a database writer or cloud storage writer) 
//	without changing ReportGenerator.

//	OOP Concept: Abstraction & Dependency Injection
//	DIP encourages dependency injection (passing dependencies into a class instead of creating them inside). 
//	It also promotes the use of abstractions to decouple high-level and low-level components.
	
	
	
	
	
	
	
	
	
	
	
}


























