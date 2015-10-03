package main.java.pojo;

public class Employee {

	public Employee(String firstName, String lastName, String companyName, long empId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.empId = empId;
	}
	
	private String firstName;
	private String lastName;
	private String companyName;
	
	private long empId;
}