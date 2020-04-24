package random;

import java.lang.*;
import java.util.Random;


public class Test05 {
	public static void main(String[] args) {
//		1. 윷놀이 1턴 구현(1/6)		
//		-빽도(0), 도(1) ,개(2) ,걸(3) ,윷(4), 모(5)		
		Random r = new Random();
		int n = r.nextInt(6);
		System.out.println(n);

String yut;		
		if(n==0) {
			yut = "빽도";
		} else if(n==1) {
			yut = "도";
		} else if(n==2) {
			yut = "개";
		} else if(n==3) {
			yut = "걸";
		} else if(n==4) {
			yut = "윷";
		} else {
			yut = "모";			
		}
		System.out.println(yut);
		
	}
}
