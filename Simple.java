package suchitra_java;

import java.util.ArrayList;
import java.util.Collections;

public class Simple {
      public static void main(String[] args) {
		 ArrayList<Sstudent> a1=new ArrayList<Sstudent>() ;
		 a1.add(new Sstudent(1,"suchi",22));
		 a1.add(new Sstudent(3,"manu",23));
		 a1.add(new Sstudent(2,"pinki",20));
		 System.out.println("sort by name");
		 Collections.sort(a1,new Namecmpr());
		 
		
		 for(Sstudent st:a1) {
			 System.out.println(st.rollno+" "+st.name+" "+st.age);
		 }
		 Collections.sort(a1,new Cmptr());

		 for(Sstudent st:a1) {
			 System.out.println(st.rollno+" "+st.name+" "+st.age);
		 } 
	}
}
