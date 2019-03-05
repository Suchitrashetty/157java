package suchitra_java;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lnkmp2 {
	 public static void main(String[] args) {
			LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
			m.put(100,"Amar");
			m.put(101,"Suchi");
			m.put(102,"Snehal");
			for(Map.Entry a:m.entrySet())
			{
				System.out.println(a.getKey()+" "+a.getValue());
			}

}
}
