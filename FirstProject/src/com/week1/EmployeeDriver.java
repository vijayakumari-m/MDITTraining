package com.week1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeDriver {

	public static void main(String[] args) throws ParseException {
		
		//Use SimpleDateFormat class used to parse the date in specified manner
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		//Create Employee object array to store employee details
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("Carl Cracker", 78750.0, sdf.parse("15/12/1987"));
		employees[1] = new Employee("Harry Hacker", 52500.0, sdf.parse("01/10/1989"));
		employees[2] = new Employee("Tony Tester", 42000.0, sdf.parse("15/03/1990"));
		
		//Use Enhanced for to iterate all the values of array and print the same
		for(Employee e : employees) {
			e.raiseSalary();
		   System.out.println(e);	
		}
	}
}
//Create class Employee
class Employee {
	
	//Declare the variables name, salary and joiningDate as private
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
	private String name;
	private double salary;
	//Use Date class of java.util package to declare date
	private Date joiningDate;
	
	//Create constructor to initialize the variables
	public Employee(String name, double salary, Date joiningDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
	
	//Use Getter method to get values of private variables
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	
    public void raiseSalary() {	
		salary += (salary * 0.05);
	}
    
    //Use toString method to print the values
	@Override
	public String toString() {
		return "[name=" + name + ", salary=" + salary + ", hireDay=" + sdf.format(joiningDate) + "]";
	}
    
    
	
}

