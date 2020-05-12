package oop.inherit.abstract3_1;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random r = new Random();
		int choice = r.nextInt(3);
		int action = r.nextInt(3);
		
//		int rate = 15% or 5% or 10% or 30%;
//		Phone p = ZFlip객체 or V60객체 or IPhone11객체;
		Phone p;
		if(choice == 0) {
			p = new ZFlip();
		}
		else if(choice == 1) {
			p = new V60();
		}
		else {
			p = new IPhone11();
		}
		
		System.out.println(p);
//		p에 무엇이 들어가있던 간에 어짜피 기능은 모두 같으니까
		if(action == 0) {
			p.call();
		}
		else if(action == 1) {
			p.sms();
		}
		else {
			p.camera();
		}
	}
}
