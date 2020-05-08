package oop.static4;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {

		
		int squ = Robot.square(10);
			System.out.println("제곱 : "+squ);
		
		double cir = Robot.circle(5);
			System.out.println("넓이 : "+cir);
	
		int dic = Robot.dice();
		System.out.println("주사위 : "+dic);
			
			
	}

}
