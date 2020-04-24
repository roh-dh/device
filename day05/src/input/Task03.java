package input;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {

//		준비 : 커피가격, 주문 개수
		Scanner sc = new Scanner(System.in);

		int order = sc.nextInt();
		sc.close();
		int coffeePrice = 1500;
		int event = 7;
		
//		계산 무료 개수, 결제 금액
		int free = order / (event+1) ;
		int price = (order-free) * coffeePrice;
//	출력
		System.out.println("총 주문 개수 : "+order);
		System.out.println("무료 개수 : "+free);
		System.out.println("결제 금액 : "+price+"원");
	}

}
