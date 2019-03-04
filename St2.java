package suchitra_java;

public class St2 {
	static int a=4,b=5;
	static int c;
	static int sum(int a,int b) {
		c=a+b;
		return c;
	}
	static {
		System.out.println("static block");
	}
	static void increment() {
		System.out.println(a++);}
		public static void main(String[] args) {
		System.out.println("sum="+sum(2,3));
		increment();
		increment();
	    increment();
	}
}

