package suchitra_java;

import java.util.Scanner;

public class Ex5 {
public static void main(String[] args) {
	try {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter 2 nos");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=a/b;
		System.out.println("result="+c);
		}
	catch(ArithmeticException ab) {
		System.out.println("the error is"+ab);
	}
	catch(Exception ac) {
		System.out.println("other error is"+ac);
	}
	finally
	{
		System.out.println("connection closing");
	}
}
}
