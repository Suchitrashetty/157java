package suchitra_java;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		try {
         	int x[]=new int[5];
         	Scanner s1= new Scanner(System.in);
			System.out.println("enter 5 nos");
 		    for(int i=0;i<=5;i++)
 		    	x[i]=s1.nextInt();
 		    System.out.println("5 nos are");
 		    for(int i=0;i<=5;i++)
 		    
 		    	System.out.println(x[i]);
 		    
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
		
		catch(Exception ab)
		
 		{
			System.out.println("the other error is"+ab);
			
		}
	}		
		
		catch(Exception b) {
			System.out.println("the unexpected event is"+b);
		}
	}

}

