package loop;

import java.util.Random;
import java.util.Scanner;

public class Test13_1 {

	public static void main(String[] args) {

// 업다운 게임
		
// 1. 랜덤 문제 생성
// 2. 1번의 입력
// 3. 1번과 2번을 비교
// 4. 2-3번을 반복
// 5. 탈출 조건 등을 설정하고 프로그램 마무리
		
		Random r = new Random();
		int com = r.nextInt(1000)+1;

		
		Scanner sc = new Scanner(System.in);
		System.out.println("정답 입력");
		int user = sc.nextInt();
		sc.close();
		
		
	}

}
