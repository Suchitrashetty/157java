package suchitra_java;

import java.util.Scanner;

public class Ex7 {
	public static void test(int d)  {
	
		Scanner s= new Scanner(System.in);
		System.out.println("enter 2 nos");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=a/b;
	    System.out.println("result is"+c);
	
	
	}

	
	public static void main(String[] args)  throws Exception{
		
		try {
			test(0);
		}
		catch(ArithmeticException ab) {
			System.out.println("the error is"+ab);
		}
	}
}
