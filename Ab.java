package suchitra_java;
import java.util.*;
 abstract class ab11 {
	 abstract void test();

}
public class Ab extends ab11{

	@Override
 void test() 
	{
		System.out.println("result announced");
		
	}
	
		public static void main(String[] args) {
			Ab n=new Ab();
			n.test();
		
	}
	
}
