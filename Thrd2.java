package Thread;

 class a implements Runnable {
	 public void run() {
		    
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
	 class Thrd2{
	 public static void main(String[] args) {
		 a obj1=new a();
		 a obj2=new a();
	 
		 Thread o=new Thread(obj1);
		 Thread o1=new Thread(obj2);
		
		 o.start();
		 o1.start();
		
	 }

	}
