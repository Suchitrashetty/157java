package suchitra_java;

import java.util.HashMap;

public class Hsmp {
    public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(100,"Amar");
		m.put(101,"Suchi");
		m.put(102,"Snehal");
		m.put(103,"Krish");
		System.out.println("initial list"+m);
		m.remove(100);
		System.out.println("updated list"+m);
		m.remove(101);
		System.out.println("updated1 list"+m);
		m.remove(102,"Snehal");
		System.out.println("updated2 list"+m);

	}
}
