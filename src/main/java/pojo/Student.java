package main.java.pojo;

public class Student {

	public Student(String firstName, String lastName, String schoolName,int standard, long rollNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.schoolName = schoolName;
		this.standard = standard;
		this.rollNo = rollNo;
	}
	
	private String firstName;
	private String lastName;
	private String schoolName;
	
	private int standard;
	
	private long rollNo;
}