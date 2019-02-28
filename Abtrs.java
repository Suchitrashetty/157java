package suchitra_java;

abstract class cad {
int eno;
String name,address;
public cad(int eno, String name, String address) {
	
	this.eno = eno;
	this.name = name;
	this.address = address;
}
abstract void details();
}
class Abtrs extends cad{
	int salary;

	public Abtrs(int eno, String name, String address, int salary) {
		super(eno, name, address);
		this.salary = salary;
	}

	@Override
	void details() {
	System.out.println("eno"+eno+"name="+name+"address="+address+"salaty="+salary);
	System.out.println("i work for mphasis");
	}
	public static void main(String[] args){
		Abtrs a=new Abtrs(1,"suchitra","bangalore",20000);
		a.details();
	}
	

	
		
	}
	
