package oop.inherit.multi2;

import java.util.Random;

public class UnitFactory {

	public static GroundUnit generateGroundUnit() {
		Random r = new Random();
		int a = r.nextInt(2);
		
		GroundUnit unit;
		if(a==0) {
			unit = new Zealot();
		}
		else {
			unit = new SCV();
		}
		return unit;
	}
	
	
	
}
