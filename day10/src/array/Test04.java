package array;

import java.lang.*;
import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
//	배열 : 변수가 줄줄이 모여 있는 것 

//	예제 : 주사위 3개를 던진 결과를 출력하는 프로그램을 구현
		Random r = new Random();

//		배열 생성 :
//		- 여러개라고 생각하지만 실제로는 3개니까 3칸의 변수를 합쳐.
		int[] d/* int배열 */ = new int[3]; // int를 3개만들어서 -> d로 부르겠다.

		// 김연훈(0) 노동환(1) 김은성(2) : 학생(배열)
		// 오른쪽 학생..
		// 기준점을 기준으로 +0 +1 +2 d[0] =d의 기준점으로 0칸떨어진 학생!

//		int a = r.nextInt(6)+1;
//		int b = r.nextInt(6)+1;
//		int c = r.nextInt(6)+1;

//		int[] d = new int[3];

//		식이나 변수를 넣을 수있다.	
		int n =5000;
		for (int i = 0; i < n; i++) {

			d[i] = r.nextInt(6) + 1;
		}

		for (int i = 0; i < n; i++) {

		}
		for (int i = 0; i < n; i++)
			System.out.println(d[i]); // *3(0~2)

// 어떻게 하면 주사위를 5000개 던질수 있을까? - 배열	 

// 여러개? -애매한(추상적인 키워드)

//	배열은 여러개를 저장하는 저장소

	}	
}
