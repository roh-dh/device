package condition;

import java.util.Scanner;

public class Test09_2 {

	//준비
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("진입시간과 분을 4자리로 입력하세요.");
		int in = sc.nextInt();
		System.out.println("진출시간과 분을 4자리로 입력하세요.");
		int out = sc.nextInt();

		sc.close();
	//계산 1. 주차이용시간 2.주차이용요금 = 만약 주차이용시간이 이만큼이라면 무료 그렇지않으면 얼마.
		int inHour = in/100;			//진입시간(시간)
		int inMinute = in%100;		//진입시간(분)
		int outHour = out/100;		//진출시간(시간)
		int outMinute = out%100;	//진출시간(분)

		int stay = (outHour*60+outMinute)-(inHour*60+inMinute);
	
		int fee;

		if(stay<30) { 
			fee = 0;
		} else {	(stay-1) /10 
			
		}
		
	}

}
