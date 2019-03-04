package suchitra_java;

import java.util.Scanner;

public class Ex8 {
public static void main(String[] args) throws Exception {
	Scanner q=new Scanner(System.in);
	System.out.println("enter marks");
	int x=q.nextInt();
	if(x>0) 
		System.out.println("ok");
		else
			throw new Exception("marks should be greater  than zero");
	}
}

