package suchitra_java;

import java.util.Iterator;
import java.util.HashSet;

public class Hst {
	public static void main(String[] args) {
		HashSet<String> ts=new HashSet<String>();
		ts.add("geet");
		ts.add("sunil");
		ts.add("amit");
		ts.add("sumit");
		ts.add("anil");
		System.out.println(ts);
		Iterator<String>i=ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("******");
		for(String str:ts)
	{
			System.out.println(str);
	}
		}
	}



