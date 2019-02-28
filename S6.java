package suchitra_java;
import java.util.*;
public class S6 {
   int eno;
   String name,address;
public S6(int eno, String name, String address) {
	this.eno = eno;
	this.name = name;
	this.address = address;
	System.out.println("result is"+eno+" "+" "+name+" "+address);

			
}
public S6()
{
	System.out.println("default constructor");
	

}

@Override
public String toString() {
	return "S6 [eno=" + eno + ", name=" + name + ", address=" + address + "]";
}
int sum(int a,int b) {
	return a+b;
	
}
float sum(float a,float b) {
	return a+b;
}
double sum(double a,int b) {
	return a+b;
}

}
	

