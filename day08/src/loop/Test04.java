package loop;

import java.util.*;

public class Test04 {
	public static void main(String[] args) {

//		주사위 5번 던진 결과를 화면에 출력하세요.
		
		Random r = new Random();

		int n =0;
		while(n<5) {
			int result = r.nextInt(6)+1;
			System.out.println("주사위를 던져서 나온숫자는 "+result+"입니다");
		n++;
		}
		
		//반복문에선 어떤걸 구할까요?
		//count 갯수
		//sum 합계
		//average 평균
	}
}
