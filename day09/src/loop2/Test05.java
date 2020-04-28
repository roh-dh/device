package loop2;

import java.util.*;

public class Test05 {
	public static void main(String[] args) throws InterruptedException {
//		타이머 프로그램
		
//		분과 초가 있는 타이머를 구현
		
//		분과 초를 사용자가 입력해서 설정
		
//		해당 시간만큼의 메세지가 화면에 출력되고 그 뒤에 알림메세지 출력
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("분과 초를 입력해 타이머를 설정하세요");
		
		int min = sc.nextInt(); System.out.println("분");
		int sec = sc.nextInt(); System.out.println("초");
		sc.close(); 

		 

/*		Scanner sc = new Scanner(System.in);
		System.out.println("분과 초를 4자리로 입력하세요.");
		int mAndS = sc.nextInt();
		sc.close();
		
		int min = mAndS/100;
		int sec = mAndS%100;*/
		int time = min*60+sec;
		
			for(int i = time; i>0 ; i--) {
				System.out.println(i/60+"분"+i%60+"초");
				Thread.sleep(1000L);
			}
			System.out.println("타이머가 종료되었습니다.");
		

	}
}
