package suchitra_java;

public class St1 {
	static int a=4,b=5;
	static int sum(int a,int b) {
		return a+b;
	}
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println("sum="+sum(2,3));
	System.out.println(a);
	}
}
