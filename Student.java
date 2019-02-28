package suchitra_java;

import java.util.Scanner;

public class Student {
	int rno;
	String name;
	void input()

	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter rno &name");
		rno=s.nextInt();
        name=s.next();
	}
	void display()
	{
		System.out.println("rno is="+rno+"name is"+name);
     }
}
