package random;

import java.lang.*;

import java.util.*;

public class Test04 {

	public static void main(String[] args) {
		Random r = new Random();
		
//		1.동전 1개를 던져서 나온 결과 - "앞" 또는 "뒤"
		
		int coin = r.nextInt(2); //0부터 1까지		
		if(coin==0) {
			System.out.println("앞");
		} else {
			System.out.println("뒤");
		}
		
//		2. 가위바위보 중 한개 추첨
		int rsp = r.nextInt(3); //0부터 2까지

		String rspResult;
		if(rsp==0) {
			 rspResult = "가위";
		 } else if(rsp == 1) {
			 rspResult = "바위";
		 } else {
			 rspResult = "보";
		 }
		System.out.println("가위바위보결과 : "+rspResult);
		
//		3. 윷놀이 1턴 결과(빽도, 도 ,개, 걸, 윷, 모)
		 
		 int play = r.nextInt(16/*개*/); //0부터 15까지
		 
		 if(play==15) {
			 System.out.println("모");
			 }else if(play==14) {
				 System.out.println("윷");
			 } else if(play==13) {
				 System.out.println("빽도");
			 } else if(play>=10) {
				 System.out.println("도");
			 } else if(play>=6) {
			 	 System.out.println("걸");
			 }	 else {
				 System.out.println("개");
						 }
		 
		 
//		-윷놀이에서는 각각의 값들이 나올 확률이 다릅니다.	
		
	}

}
