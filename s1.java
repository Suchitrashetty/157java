package suchitra_java;
import java.util.*;

public class s1 {
	public static void main(String[] args) {
		Scanner  s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter 5 nos");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("5 nos are");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}

}
