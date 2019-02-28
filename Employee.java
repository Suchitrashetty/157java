package suchitra_java;

public class Employee {
private int eno,salary;
private String name;
private Address address;

public void setAddress(Address address) {
	this.address = address;
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}

}
