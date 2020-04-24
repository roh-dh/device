package input;

import java.lang.*;
import java.util.*;

public class Test05 {
	public static void main(String[] args) {
/* Scanner를 이용하여 다음 문제를 푸세요.
 	
 	제 차는 1L에 10.5km를 달릴 수 있습니다.
 	
 	서울에서 부산갔다가 목포갔다가 서울오려면 얼마나 기름을 넣어야 합니까?
 	(서울-부산은 450km, 부산-목포는 200km, 목포-서울은 400km)
	
	휘발유 1L당 가격을 입력받아 예상 여행 경비를 계산하세요.
 */
		
//		1. 1050km를 여행하기 위해 필요한 기름(L) 계산		
		int distance = 1050;		//여행거리
		double effect = 10.5;	//연비
		
		double liter = distance / effect;
		System.out.println("여행에 필요한 기름은 " + liter+"L 입니다");
//		2. 휘발유 가격을 입력받아 여행경비를 계산

		Scanner sc = new Scanner(System.in);
		System.out.println("휘발유 가격을 입력하세요");

		int price = sc.nextInt();
	
		sc.close();

		int total = (int) ( liter * price);
		System.out.println("필요 예상 경비는 "+total+"입니다");
		
		
		
	}

}
