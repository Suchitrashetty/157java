package Thread;

public class Thrd1 extends Thread{
   public void run() {
	   for(int i=1;i<=10;i++) {
		   try
		   {
			 System.out.println(i);
			 sleep(500);		   }
	   
	   catch(Exception ae) {
		   ae.printStackTrace();
	   
	   }
	}
   }

public static void main(String[] args) {
	 Thrd1 ob=new Thrd1();
	 Thrd1 ob1=new Thrd1();
	 Thrd1 ob2=new Thrd1();
	 ob.start();
	 ob1.start();
	 ob2.start();
}}

