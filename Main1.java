package suchitra_java;

public class Main1 {
public static void main(String[] args) {
	

Marks2 t=new Marks2();
t.setPhy(43);
t.setChem(45);
t.setMaths(78);
Student2 s=new Student2();
	s.setRollno(1);
	
	s.setName("suchi");
	
	s.setAddress("belgaum");
	
	s.setMark(t);
	
	System.out.println("rollno="+s.getRollno()+"name="+s.getName()+"address="+s.getAddress()+"marks="+s.getMark());
}
}
