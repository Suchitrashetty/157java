package suchitra_java;

import java.util.Scanner;

public class Marks  extends Student{
int phy,chem,maths;
void input() {
	super.input();
	Scanner s=new Scanner(System.in);
	System.out.println("enter phy,chem,maths");
	phy=s.nextInt();
	chem=s.nextInt();
	maths=s.nextInt();
}
void display() {
	super.display();
	System.out.println("marks are"+"phy="+phy+"chem="+chem+"maths="+maths);
}
	public static void main(String[] args) {
		Marks a=new Marks();
		a.input();
		a.display();
		
		}
}
