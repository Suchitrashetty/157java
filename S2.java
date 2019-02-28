
//to enter 3 nos and find largest
package suchitra_java;

import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter 3 nos");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
			System.out.println("a is latgest");
		else if(b>a && b>c)
			System.out.println("b is latgest");
		else
			System.out.println("c is latgest");	
			
				
	}

}
