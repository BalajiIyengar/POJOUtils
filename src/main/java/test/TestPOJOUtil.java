package main.java.test;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import javax.naming.OperationNotSupportedException;

import main.java.POJOUtils;
import main.java.pojo.Employee;
import main.java.pojo.Student;

public class TestPOJOUtil {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, OperationNotSupportedException {
		Map<String,Object> employeeMap = POJOUtils.getPOJOAsMap(
				new Employee("EFN", "ELN", "ECOMP", 123345));
		System.out.println("Employee as Map ==> "+employeeMap);
		
		try {
			Map<String,Object> nullObj = POJOUtils.getPOJOAsMap(null);
			System.out.println("Null as Map ==> "+nullObj);
		}
		catch(UnsupportedOperationException ex){
			System.err.println(ex.getMessage());
		}
		
		Map<String,Object> studentMap = POJOUtils.getPOJOAsMap(
				new Student("SFN", "SLN", "SSCHNM", 9 , 43));
		System.out.println("Student as Map ==> "+studentMap);
		
		
		List<String> fieldNames = POJOUtils.getPOJOFieldNames(new Student("SFN", "SLN", "SSCHNM", 9 , 43));
		System.err.println(fieldNames.toString());
		
		
		List<Field> pojoFields = POJOUtils.getPOJOFieldsAsList(new Student("SFN", "SLN", "SSCHNM", 9 , 43));
		System.out.println(" POJO Fields --> "+pojoFields);
		
	}
	
}