package loop;

import java.util.Random;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		//이벤트에서 경품에 당첨될 확률이 2% 입니다.
		
		// (1) 30번 추첨했을 때 경품에 당첨된 횟수를 구하여 출력
		
		Random r = new Random();
		//		  당첨될 0.2% 확률 
		int count =0;
		int n =0;
		
		while(n<30) {
			
				
		int lottery =r.nextInt(100); 			//0.2%확률		
		if(lottery<=1) {							// 0,1 = 당첨 나머지는 꽝
			count++;
		}
		n++;
		
		}
		System.out.println("당첨된 횟수 = "+count+"번");
		
		
		Random r2 = new Random();
		Scanner sc = new Scanner(System.in);

		int count2 =sc.nextInt();
		int n2 =0;
		
		while(n<30) {
			
				
		int lottery2 =r.nextInt(100); 			//0.2%확률		
		if(lottery2<=1) {							// 0,1 = 당첨 나머지는 꽝
			count2++;
		}
		n2++;
		
		}
		System.out.println("당첨된 횟수 = "+count2+"번");		


		//		30번 추첨한다.
		
		
		
		
		
		// (2) 사용자에게 원하는 추첨 횟수를 입력하도록 한 뒤 당첨된 횟수를 구하여 출력
		
	
		
	}
}
