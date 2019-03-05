package suchitra_java;


import java.util.LinkedHashMap;

public class Lnkmp {
	 public static void main(String[] args) {
			LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
			m.put(100,"Amar");
			m.put(101,"Suchi");
			m.put(102,"Snehal");
		System.out.println("keys:"+m.keySet());
		System.out.println("values:"+m.values());
		System.out.println("keys-values pair:"+m.entrySet());
		m.put(99, "p");
		System.out.println("keys-values pair:"+m.entrySet());
	 }
	 
}
