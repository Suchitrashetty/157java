package suchitra_java;

import java.util.Scanner;

public class S3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("enter a no");
int x=s.nextInt();
int y;
for(int i=1;i<=10;i++)
{
	y=x*i;
	System.out.println(x+"*"+i+"="+y);
}
	}

}
