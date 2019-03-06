package suchitra_java;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


	class emp2{
		   int id;
		   String name,address;
		   int salary;
		public emp2(int id, String name, String address, int salary) {
			
			this.id = id;
			this.name = name;
			this.address = address;
			this.salary = salary;
		}
		   
		}
		public class Emp1hsmp{
			public static void main(String[] args) {
				HashMap<Integer,emp2> map=new HashMap<Integer,emp2>();
				emp2 b1=new emp2(101,"s","a",2000);
				emp2 b2=new emp2(102,"t","b",3000);
				emp2 b3=new emp2(103,"r","c",4000);
				//adding employee object to map
				map.put(1,b1);map.put(2,b2);map.put(3,b3);
		         //traversing map
				for(Map.Entry<Integer,emp2> entry:map.entrySet()) {
					int key=entry.getKey();
					emp2 b=entry.getValue();
					System.out.println(key+"details");
					System.out.println(b.id+" "+b.name+" "+b.address+" "+b.salary);
				}

			}
		}


