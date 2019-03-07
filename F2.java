package files;
//copy data from one file to another
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class F2 {
 public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("test.txt");
	FileOutputStream fos=new FileOutputStream("pqr.doc");
	int ch;
	while((ch=fis.read())!=-1) {
		fos.write(ch);
	}
	fis.close();
	fos.close();
	System.out.println("file copied");
}
}
