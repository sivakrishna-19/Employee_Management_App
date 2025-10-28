package com.flm;

public class Employee {
	
	private int emp_id;
	private String emp_name;
	private int age;
	private String email;
	private String phoneno;
	private int salary;
	
	public Employee() {
		
	}
	public Employee(int emp_id, String emp_name, int age, String email, String phoneno, int salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
		this.email = email;
		this.phoneno = phoneno;
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", age=" + age + ", email=" + email
				+ ", phoneno=" + phoneno + ", salary=" + salary + "]";
	}
	
	 
	
	

}
