package oop.inherit.multi2;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		Random r = new Random();
		
//		지상유닛을 랜덤으로 10마리 생성하여 이동명령을 실행
		for(int i=0; i < 10; i++) {
			int a = r.nextInt(2);//질럿(0), SCV(1)
			
//			GroundUnit unit = 질럿 or SCV;
			GroundUnit unit;
			if(a == 0) {
				unit = new Zealot();//up-casting(Zealot -> GroundUnit)
			}
			else {
				unit = new SCV();//up-casting(SCV -> GroundUnit)
			}
			System.out.println(unit);
			unit.walk();
		}
		
		
		
		

		

/*		
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
		*/
	}
}
