package suchitra_java;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		
 		try {
			Scanner s= new Scanner(System.in);
			System.out.println("enter 2 nos");
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=a/b;
		    System.out.println("result is"+c);
		}
	catch(ArithmeticException a)
		{
			System.out.println("the error is"+a);
		}
		finally
 		{
			System.out.println("the other error is");
			
		}

	}

}


