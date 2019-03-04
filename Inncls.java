package suchitra_java;

public class Inncls {
       static int data=30;
       static class Inner
       {
    	 static   int a=25;
    	 int x=90;
    	   void msg() {
    		   System.out.println("value is="+data);
    	   }
    	   static void test() {
    		   System.out.println("correct");
    	   }
       }
       public static void main(String[] args) {
		Inncls.Inner s=new Inncls.Inner();
		s.msg();
		System.out.println(Inner.a);// or (s.a)
		System.out.println(s.x);
		Inner.test();
	}
}
