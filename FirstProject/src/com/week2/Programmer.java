package com.week2;

 class Programmer extends Employee {
	
	 double bonus = 1500;
	
	public static void main(String[] args) {

		Programmer emp1 = new Programmer();
		
		double totalSalary = emp1.salary + emp1.bonus ;
		System.out.println("Total Salary : "+totalSalary);
		

	}

}
