package suchitra_java;

public class Address {
	private int strtno;
	private String colony,city,state;
	public int getStrtno() {
		return strtno;
	}
	public void setStrtno(int strtno) {
		this.strtno = strtno;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [strtno=" + strtno + ", colony=" + colony + ", city=" + city + ", state=" + state + "]";
	}
	

}
