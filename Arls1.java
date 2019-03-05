package suchitra_java;

import java.util.ArrayList;

public class Arls1 {
   public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);a.add(50);
	a.add(60);a.add(100);a.add(90);a.add(80);
System.out.println(a);
a.add(3,500);   //100 will move to next position
System.out.println(a);
a.remove(2);     //removes 60
System.out.println(a);
a.set(4,1000);    //replaces 90 with 1000
System.out.println(a);
   }
}
