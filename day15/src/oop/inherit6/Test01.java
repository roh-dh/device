package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		GalaxyS10 a = new GalaxyS10();
		a.number = "010-5232-3286";
		a.output();
		a.bixby();
		a.call();
		a.sms();
		System.out.println("");
		
		GalaxyNote10 a2 = new GalaxyNote10();
		a2.number = "010-5232-3286";
		a.output();
		a2.memo();
		a2.call();
		a2.sms();
		System.out.println("");
		
		IPhone10 a3 = new IPhone10();
		a3.number = "010-5232-3286";
		a.output();
		a3.itunes();
		a3.call();
		a3.airdrop();
		System.out.println("");
		
		IPhone11 a4 = new IPhone11();
		a4.number = "010-5232-3286";
		a.output();
		a4.siri();
		a4.call();
		a4.airdrop();
		System.out.println("");
	}

	
	

}
