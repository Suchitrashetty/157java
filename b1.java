package suchitra_java;

	abstract class abm{
		abstract void disp();
		void address() {
			System.out.println("bangalore");
		}
	}
	public class b1 extends abm{

		@Override
		void disp() {
			// TODO Auto-generated method stub
			System.out.println("display banaglore city");
		}
		public static void main(String[] args) {
			b1 ob=new b1();
			ob.address();
			ob.disp();
		}
		
	}


