package oop.inherit.abstract2;

public class Test01 {
	public static void main(String[] args) {
//		정적 타입
		GalaxyS20 a = new GalaxyS20();
		IPhone11 b = new IPhone11();
		
		a.call();
		
		
//		동적 타입
		Phone c = new GalaxyS20();
		Phone d = new IPhone11();
		
		c.call();
		d.call();
	}
}