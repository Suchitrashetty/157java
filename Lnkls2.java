package suchitra_java;

import java.util.LinkedList;
import java.util.ListIterator;

public class Lnkls2 {
  public static void main(String[] args) {
	  LinkedList l1=new LinkedList();
	  l1.add(10);l1.add(40);
		l1.add(20); l1.add(80);l1.add(90); l1.add(50);
		ListIterator i=l1.listIterator();
		System.out.println("forward direction");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("backward direction");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
}
}
