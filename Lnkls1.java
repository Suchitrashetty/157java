package suchitra_java;

import java.util.LinkedList;

public class Lnkls1 {
       public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		l1.add(10);l1.add(40);
		l1.add(20); l1.add(80);l1.add(90); l1.add(50);
        l2.add(100);l2.add(200);l2.add(300);l2.add(400);l2.add(300);  
       System.out.println(l1); 
       System.out.println(l2);
       l1.addFirst(100);
       System.out.println(l1);
       l1.addLast(200);
       System.out.println(l1);
       l1.removeFirst();
       l1.removeLast();
       System.out.println(l1);
       
       System.out.println(l1.getFirst()); System.out.println(l1.getLast());
       l1.addAll(l2);
       System.out.println(l1);
       }
}
