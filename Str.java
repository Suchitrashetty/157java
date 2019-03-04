package suchitra_java;

public class Str {
public static void main(String[] args) {
	

	String s1="Mphasis and Global soft";
System.out.println(s1);
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.indexOf('a'));
System.out.println(s1.lastIndexOf('a'));
System.out.println(s1.substring(5));
System.out.println(s1.substring(5,10));
System.out.println(s1.startsWith("Mp"));
System.out.println(s1.endsWith("ft"));
System.out.println(s1.replace("soft","software"));
String s2="Mphasis AND global soft,mumbai";
System.out.println(s2);
System.out.println("length of s2)"+s2.length());
char name[]=s1.toCharArray();
int leng=name.length;
System.out.println("length of char array="+leng);
for(int i=0;i<leng;i++) {
	System.out.println(name[i]);
}
}
}
