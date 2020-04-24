package input;

import java.lang.*;
import java.util.*; // util에 있는 (*)기능을  다 쓰겠다. 
//import java.util.Scanner // util에 있는 Scanner만 쓰겠다.

public class Test02 {

	public static void main(String[] args) {
//		Scanner 라는 도구를 사용하여 사용자에게 입력받는 코드
//		- 글자를 모아서 입력받아준다.
//		- 자료형을 원하는 형태로 받을수 있다.

//		Scanner 를 쓰려면 어떻게 해야 하는가?		
		Scanner sc = new Scanner(System.in); // 생성

		int a = sc.nextInt();
		System.out.println(a);
		
		int b = sc.nextInt();
		System.out.println(b);
		sc.close(); // 종료

	// 입력창 느려지는것을 막기위해 console창에서 우클릭 disconnect all을 하는 습관을 들이자.
	
	}

}
