package suchitra_java;

public class St {
static int a=4,b=5;
static int sum() {
	return a+b;
}
static {
	System.out.println("static block");
}
public static void main(String[] args) {
	System.out.println("sum="+sum());
System.out.println(a);
}

}
