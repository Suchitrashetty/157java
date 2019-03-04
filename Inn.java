package suchitra_java;

public class Inn {
private int data=30;
void display() {
	System.out.println("this is outer class");
	class Local{
		void msg() {
			System.out.println(data);}
	
	} 
	Local ob=new Local();
	ob.msg();}
	
public static void main(String[] args) {
	Inn a=new Inn();
	a.display();
}
		
	}


