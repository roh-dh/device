package loop;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

// 업다운 게임

//	컴퓨터가 1부터 1000사이의 무작위 숫자를 하나 생성한 뒤 사용자가 이것을 맞추는 게임입니다.

// - 사용자가 입력한 값이 정답보다 작으면 컴퓨터는 "up!"이라고 출력합니다.	
// - 사용자가 입력한 값이 정답보면 크면 컴퓨터는 "down!"이라고 출력합니다.
// - 사용자가 입력한 값이 정답이라면 컴퓨터는 "정답!" 출력 후 프로그램을 종료

//		프로그램이 종료되기전(정답을 맞춘 뒤) 총 입력 횟수를 출력

//		(사용자는 컴퓨터가 생성한 숫자를 확인 할 수 없습니다.)

//		1부터 1000사이의 무작위 숫자 생성		
		Random r = new Random();
		int number = r.nextInt(1000) + 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		

		int a = 0;
		while (a<100) {

			int input = sc.nextInt(); // 입력한 값
			if (number == input) {
				System.out.println("정답!");
				break;
			} else if (number > input) {
				System.out.println("up!");
			} else {
				System.out.println("down!");
			}
			a++;
		}
		System.out.println(number);
	}
}
