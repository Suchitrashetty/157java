package suchitra_java;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class Lnkd {
	public static void main(String[] args) {
		LinkedHashSet<String> ts=new LinkedHashSet<String>();
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



