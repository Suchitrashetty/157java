package suchitra_java;
public class Strex {

	public static void main(String[] args) {
		String a="apple";
		String b="apple";
		String c=new String("apple");
		if(a==b)
			System.out.println("true");
		else
			System.out.println("false");
		if(a==c)
			System.out.println("true");
		else
			System.out.println("false");
		if(a.equals(c))
			System.out.println("true");
		else
			System.out.println("false");
		


	}
}
