package com.example;


import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	
	HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee emp1=new Employee(101, "Tishi" , 24, "IT", "Developer", 25000);
	Employee emp2=new Employee(102, "Kushi" , 24, "IT", "Developer", 75000);
	Employee emp3=new Employee(103, "Nishi" , 24, "IT", "Developer", 50000);
	Employee emp4=new Employee(104, "Rishi" , 28, "IT", "Testing", 35000);
	
	Scanner sc=new Scanner(System.in);
    boolean found=false;
	
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;
	
	public EmployeeService() {
		
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	//view all employees
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
		//view emp based on id
	public void viewEmp() {
		boolean found=false;
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
				
			}
		}
		
		if(! found) {
			System.out.println("Employee with this id is not present");
		}
	}
	//update the employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter new salary");
				sal=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(! found) {
			System.out.println("Employee is not present" );
		}
		else {
			System.out.println("Employee details updated succesfully");
		}
	}
	// delete employee
	
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				
			}
		}
		if(! found) {
			System.out.println("Employee is not present");
		}
		else {
			
				empset.remove(empdelete);
				System.out.println("Employee id deleted successfully");
			}
			}
	//add employee
	
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter desiganation");
		desiganation=sc.next();
		System.out.println("Enter department");
		department=sc.next();
		System.out.println("Enter sal");
		sal=sc.nextDouble();
		
		Employee emp=new Employee(id, name, age, desiganation, department, sal);
		
		empset.add(emp);
		System.out.println(emp);
			System.out.println("Employee added successfully");
		
		
		
	}

			
		
			
	}
	
		




