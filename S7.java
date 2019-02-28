package suchitra_java;

public class S7 {
	public static void main(String[] args) {
		S6 obj=new S6();
		S6 obj1=new S6(1,"suchitra","bangalore");
		System.out.println(obj1);
		int a=obj.sum(2,3);
		System.out.println(a);
		float b=obj.sum(2.2f,2.3f);
		System.out.println(b);
		double c=obj.sum(2.3,3);
		System.out.println(c);
}
}