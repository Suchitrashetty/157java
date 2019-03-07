package files;

import java.io.BufferedReader;
import java.io.FileReader;

public class F4 {
public static void main(String[] args)throws Exception {
	FileReader fr=new FileReader("test.txt");
	BufferedReader br= new BufferedReader(fr);
	String name;
	while((name=br.readLine())!=null)

{
	System.out.println(name);
	}
fr.close();
br.close();
System.out.println("file copied");
}
}
