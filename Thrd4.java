package Thread;

class c implements Runnable{
	synchronized public void run() {
		try
		{
			Thread t=Thread.currentThread();
			String name=t.getName();
			for(int i=0;i<10;i++) {
				System.out.println(name+"="+i);
				Thread.sleep(500);
				if(name.equals("raj")&& (i==4)){
				wait();
				}
				if(name.equals("geeta")&& (i==4)){
					wait();
					}
				if(name.equals("seeta")&& (i==6)){
					
					System.out.println("raj and geeta wake up");
					notifyAll();
					}
				if(name.equals("raj")&& (i==9)){
					notify();
					}
			}}
			catch(Exception c) {}
			



			}
		
}
class Thrd4{
	public static void main(String[] args)throws Exception {
		c ab=new c();
		Thread p=new Thread(ab,"raj");
		Thread q=new Thread(ab,"seeta");
		Thread r=new Thread(ab,"geeta");
	p.start();
	q.start();
	r.start();
	
	}

}
