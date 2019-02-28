package suchitra_java;

public class Empmain {
public static void main(String[] args) {
	Address a=new Address();
	a.setStrtno(1);
	a.setColony("nehru nagar");
	a.setState("karnataka");
	a.setCity("Bangalore");
	Employee e=new Employee();
    e.setEno(2);
    e.setName("suchitra");
    e.setSalary(1200);
    e.setAddress(a);
    System.out.println("result is"+e.getEno()+" "+e.getName()+" "+e.getSalary()+" "+e.getAddress());
}
}
