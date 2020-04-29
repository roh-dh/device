package array;

import java.lang.*;
import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
//	배열 : 변수가 줄줄이 모여 있는 것 
	
//	예제 : 주사위 3개를 던진 결과를 출력하는 프로그램을 구현
		Random r = new Random();

		int a = r.nextInt(6)+1;
		int b = r.nextInt(6)+1;
		int c = r.nextInt(6)+1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
// 어떻게 하면 주사위를 5000개 던질수 있을까? - 배열	 
//		몇개의 데이터를 저장할거니?
		
		
	}
}
