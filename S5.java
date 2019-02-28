package suchitra_java;

import java.util.Scanner;

public class S5 {
         int eno;
         String ename,address;
         void input(){
        	 
      
        	 Scanner s =new Scanner(System.in);
        	 System.out.println("enter eno,name,address");
        	 eno=s.nextInt();
        	 ename=s.next();
        	 address=s.next();
        	 }
         void output(){
        	 System.out.println("the empno"+eno+"name is"+ename+"address is"
        			 +address);
         }
         public static void main(String[] args) {
			S5 obj=new S5();
			obj.input();
			obj.output();
		}
}
