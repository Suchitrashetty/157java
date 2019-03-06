package suchitra_java;

import java.util.Comparator;

class Cmptr implements Comparator<Sstudent> {
	 public int compare(Sstudent s1,Sstudent s2) {
		 if(s1.age==s2.age) 
			 return 0;
	    else if(s1.age>s2.age)
				 return 1;
			 else
				 return -1;
			 
		 
	 }
	 

}
