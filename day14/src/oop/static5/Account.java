package oop.static5;

public class Account {
//
	private static double baseRate = 2;

	public void setBaseRate(double baseRAte) {
		Account.baseRate= baseRate;
		
	public static double getBaseRate() {
		return baseRate;
	}
	}
	
	
	
	private String name;
	private double plusRate;
	private long money;
	
//	setter && getter
public void setName(String name) {
if(plusRate<0) return;
	this.name = name;
}
public String getName() {
	return name;
}

public void setPlusRate(double plusRate) {
	this.plusRate = plusRate;
}
public double getPlusRate() {
	return plusRate;
}
public void setMoney(long money) {
	this.money = money;
}
public long getMoney() {
	return money;
}
	
public Account(String name, double plusrate, long money) {
	this.setName(name);
	this.setPlusRate();
}


	
}
