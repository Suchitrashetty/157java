package suchitra_java;

import java.util.LinkedHashMap;
import java.util.Map;

 class emp1{
   int id;
   String name,address;
   int salary;
public emp1(int id, String name, String address, int salary) {
	
	this.id = id;
	this.name = name;
	this.address = address;
	this.salary = salary;
}
   
}
public class Emp{
	public static void main(String[] args) {
		Map<Integer,emp1> map=new LinkedHashMap<Integer,emp1>();
		emp1 b1=new emp1(101,"s","a",2000);
		emp1 b2=new emp1(102,"t","b",3000);
		emp1 b3=new emp1(103,"r","c",4000);
		map.put(1,b1);map.put(2,b2);map.put(3,b3);
		for(Map.Entry<Integer,emp1>entry:map.entrySet()) {
			int key=entry.getKey();
			emp1 b=entry.getValue();
			System.out.println(key+"details");
			System.out.println(b.id+" "+b.name+" "+b.address+" "+b.salary);
		}

	}
}
