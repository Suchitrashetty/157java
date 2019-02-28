package suchitra_java;
interface inr1{
	
	int a=10;
	void disp();
}
interface inr2{
	void disp1();
}
public class Intr implements inr1,inr2
{

	@Override
	public void disp1() {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		System.out.println("second result");
		
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

	@Override
	public void disp() {
	System.out.println("first result");
		
	}
	public static void main(String[] args) {
		Intr a=new Intr();
		a.disp();
		a.disp1();
		
	}

}
