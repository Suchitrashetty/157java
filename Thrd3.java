package Thread;


	class b implements Runnable {
		synchronized public void run() {
			    
				   try{
					   
				   
				   for(int i=1;i<=10;i++) {
					 System.out.println(i);
				     	 Thread.sleep(500);		 
				    }
			   }
			   catch(Exception ae) {
				   ae.printStackTrace();
			   
			   }
		 }}
		 class Thrd3{
		 public static void main(String[] args) {
			 b obj1=new b();
		 
			 Thread o=new Thread(obj1);
			 Thread o1=new Thread(obj1);
			
			 o.start();
			 o1.start();
			
		 }

		}


