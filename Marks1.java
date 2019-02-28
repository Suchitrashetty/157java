package suchitra_java;
import java.util.*;
public class Marks1  extends Student1{
	int phy,chem,maths;

	public Marks1(int rno,String name,int phy, int chem, int maths) {
	     super(rno,name);
	     this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}
	void display() {
		
		System.out.println("marks are "+"phy="+phy+" chem="+chem+" maths="+maths);
	}
	public static void main(String[] args) {
		Marks1 a=new Marks1(1,"suvi",12,23,34);
		a.display1();
		a.display();
	}
}