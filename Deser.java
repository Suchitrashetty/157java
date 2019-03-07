package serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deser {
 public static void main(String[] args) {
	    Emp e=null;
	    try
	    {
	    	FileInputStream filein =new FileInputStream("abc.txt");
	    	ObjectInputStream in=new ObjectInputStream(filein);
	    	e=(Emp)in.readObject();
	    	in.close();
	    	filein.close();
	    }
	    catch(IOException i) {
	    	i.printStackTrace();
	    	System.out.println(i);
	    }
	    catch(ClassNotFoundException c) {
	    	System.out.println("class not found");
	    	c.printStackTrace();
	    }
	    System.out.println("deserilized employee");
	    System.out.println("Name"+e.name);
	    System.out.println("address"+e.address);
	    System.out.println("SSN"+e.SSN);
	    System.out.println("number"+e.number);
}
}
