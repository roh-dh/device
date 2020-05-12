package oop.inherit.multi2;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {

		Random r = new Random();

		int i;
		System.out.println("지상유닛을 랜덤으로 10마리를 생성합니다.");
		for(i=0; i<10; i++) {
			
		int isGround = r.nextInt(2);
		// 0이면 Zealot 1이면 SCV
		if(isGround==0) {
			Zealot a1 = new Zealot();
			a1.walk();
			System.out.println();
		} else {
			SCV a2 = new SCV();
			a2.walk();
			System.out.println();
		}
		
		}

		
		System.out.println("공중유닛을 랜덤으로 10마리 생성합니다.");
		// 0이면 Wraith 1이면 Overlord
		for(i=0; i<10; i++) {
			
		int isFlying = r.nextInt(2);
		
		if(isFlying==0) {
			Wraith b1 = new Wraith();
			b1.fly();
			System.out.println();

		} else {
			Overlord b2 = new Overlord();
			b2.fly();
			System.out.println();
		}
		}
		System.out.println("테란유닛을 랜덤으로 10마리 생성합니다.");
		//0이면 SCV 1이면 Wraith
		for(i=0; i<10; i++) {
			
		int isTerran = r.nextInt(2);
		if(isTerran==0) {
			SCV c1 = new SCV();
			c1.attack();
			System.out.println();

		} else {
			Wraith c2 = new Wraith();
			c2.attack();
			System.out.println();

		}
		}
	}
}
