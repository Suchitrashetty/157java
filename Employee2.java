package serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Emp implements Serializable {
	public String name;
	public String address;
	public transient int SSN;
	public int number;

}
public class Employee2{
	public static void main(String[] args) {
		Emp e=new Emp();
		e.name="suchitra";
		e.address="bangalore";
		e.SSN=111;
		e.number=12;
		try
		{
			FileOutputStream fileout=new FileOutputStream("abc.txt");//file will be created
			ObjectOutputStream out=new ObjectOutputStream(fileout);//write the object into file
			out.writeObject(e);
			out.close();
			fileout.close();
			System.out.println("serilaized data is saved in abc.txt");
		}
		catch(IOException i) {
			i.printStackTrace();
		}
	}
}