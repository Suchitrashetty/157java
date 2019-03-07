package files;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class F3 {
 public static void main(String[] args) throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter empid");
	int emp=Integer.parseInt(br.readLine());
	System.out.println("enter the name");
	String name=br.readLine();
	System.out.println("enter salary");
 float sal=Float.parseFloat(br.readLine());
 System.out.println("empid"+emp);
 System.out.println("empname"+name); 
 System.out.println("empsal"+sal);
}
}
