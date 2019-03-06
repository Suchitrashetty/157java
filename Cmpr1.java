package suchitra_java;

import java.util.ArrayList;
import java.util.Collections;

 class emp4 implements Comparable<emp4> {
	int id;
	String name,address;
	int salary;
	public emp4(int id, String name, String address, int salary) {
	
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public int compareTo(emp4 a) {
		if(id==a.id)
			return 0;
		else if(id>a.id)	
			return 1;
		else 
			return -1;
		}

}
public class Cmpr1{
	public static void main(String[] args) {
		ArrayList<emp4> a1=new ArrayList<emp4>();
		emp4 b1=new emp4(1,"suchi","banaglore",10000);
		emp4 b2=new emp4(3,"suvi","banaglore",20000);
		emp4 b3=new emp4(2,"sinchu","banaglore",30000);
		a1.add(b1);a1.add(b2);a1.add(b3);
		Collections.sort(a1);
		for(emp4 a:a1) {
			System.out.println(a.id+" "+a.name+" "+a.address);
		}
		}
}
