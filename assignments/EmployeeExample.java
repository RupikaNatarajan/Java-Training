package com.celcom.assignments;

class Employee {
	private String name;
	private String jobTitle;
	private long salary;
	
	Employee(String name, String jobTitle, long salary) {
		
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public long calculateSalary(long incrementAmount) {
		long newSalary = salary + incrementAmount;
		return newSalary;
		//System.out.println("Calculated Salary : " + newSalary);
	}
	
	void updateSalary(long updatedSalary) {
		System.out.println("Salary has been updated to : " + updatedSalary);
	}
	
	
	
	
	
	
}

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Rupika", "Trainee" , 20000);
		long newSalary = employee.calculateSalary(5000);
		employee.updateSalary(newSalary);
		
	}

}
