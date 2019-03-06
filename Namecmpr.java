package suchitra_java;

import java.util.Comparator;

class Namecmpr implements Comparator<Sstudent>
{
  public int compare(Sstudent s1,Sstudent s2) {
	  return s1.name.compareTo(s2.name);
  }
}
