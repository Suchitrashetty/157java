package suchitra_java;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
  public static void main(String[] args) {
	Vector v=new Vector();
	v.add(20);v.add(30);v.add(80);v.add(50);
	System.out.println(v);
	Enumeration en=v.elements();
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
  }
}
