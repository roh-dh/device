package oop.modifier2;

public class Mobile {

	private String name;
	private String mobileCarrier ;
	private int price;
	private int period;
	
	public void setName(String name) {
	this.name = name;	
	}
	public void setMobileCarrier(String mobileCarrier) { //하나만 설정..
	if(mobileCarrier=="SK"||mobileCarrier=="KT"||mobileCarrier=="LG"||mobileCarrier=="알뜰폰") {
		this.mobileCarrier = mobileCarrier;
	}
		
	}
	public void setPrice(int price) { //가격은 음수X
		if(price>=0) {
			this.price = price;
		}
	}
	
	public void setPeriod(int period) { //약정기간은 6개월단위
		if(period%6==0) {
			this.period = period;
		}
	}
	
	public String getName() {
		return this.name;
	}
	public String getMobileCarrier() {
		return this.mobileCarrier;
	}
	public int getPrice() {
		return this.price;
	}
	public int getPeriod() {
		return this.period;
	}
	
	void output() {
		System.out.println("기종 "+this.name);
		System.out.println("통신사 "+this.mobileCarrier);
		System.out.println("가격 "+this.price);
		System.out.println("약정기간 "+this.period);
		System.out.println();
		
	}
	
}
