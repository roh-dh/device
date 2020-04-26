package condition;

import java.util.Scanner;

public class Test09_2 {

	//준비 시간을 4자리로 입력, 가격 등 변경 할 수 있게 둠.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("진입시간과 분을 4자리로 입력하세요.");
		int in = sc.nextInt();
		System.out.println("진출시간과 분을 4자리로 입력하세요.");
		int out = sc.nextInt();
		sc.close();
		
		//int 10분당 가격 = 1000;
		//int 
		
	//계산 1. 주차이용시간 2.주차이용요금 = 만약 주차이용시간이 이만큼이라면 무료 그렇지않으면 얼마.
		int inHour = in/100;			//진입시간(시간)
		int inMinute = in%100;		//진입시간(분)
		int outHour = out/100;		//진출시간(시간)
		int outMinute = out%100;	//진출시간(분)

		int time = (outHour*60+outMinute)-(inHour*60+inMinute); //주차시간
	
		int fee;	 //주차요금

		if(time<30) { 
			fee = 0;
		} else { 
			fee =((time-1) /10 -2)*1000;
		}
				
		if(fee>=10000) {
			fee = 10000;
		}
		
		System.out.println("주차요금 : "+fee+"원");
	}

}
