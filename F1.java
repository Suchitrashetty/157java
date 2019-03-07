package files;

import java.io.DataInputStream;
import java.io.FileOutputStream;

//storing data into a file
public class F1 {
public static void main(String[] args) throws Exception{
	DataInputStream s= new DataInputStream(System.in);
	FileOutputStream fos=new FileOutputStream("abc.doc");
	System.out.println("enter the text");
	int ch;  //storing data in byte format
	while((ch=s.read())!='\n') {
		fos.write(ch);
	}
	fos.close();
}
}
