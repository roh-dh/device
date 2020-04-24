package condition;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		여행사 결제 프로그램

//		사용자에게 여행가고싶은 달을 숫자로 입력받아서 / 예상 할인율을 보여주는 프로그램 구현

//		할인율은 계절마다 다르며 다음과 같다.

//		봄 : 20% 할인 - 3, 4, 5월
//		여름 : 할인 없음(0%) - 6, 7, 8월
//		가을 : 5% 할인 - 9, 10, 11월
//		겨울 : 30% 할인 - 12, 1, 2월
//		이상한 값이 입력되는 경우는 고려하지 않습니다.		

		Scanner sc = new Scanner(System.in);
		System.out.println("여행을 계획하신 월을 입력해주세요.");
	
		int month = sc.nextInt();
		sc.close();
		
//봄? 여름? 가을? 겨울
boolean	isSpring = month /3 == 1;
boolean isSummer = month /3 ==2;
boolean isFall = month /3 ==3;
boolean isWinter = month /3 ==4 || month/3 ==0 && month!=0;

String discount;

if(isSpring) {
	discount ="20%";
} else if(isSummer) {
	discount = "할인없음";
} else if(isFall) {
	discount ="5%" ;
} else if(isWinter) {
	discount ="30%";
} else
	discount = "잘못 입력하셨습니다.";
System.out.println(discount);
	}
}




//					여행사 결제 프로그램

//					사용자에게 여행가고싶은 달을 숫자로 입력받아서 / 예상 할인율을 보여주는 프로그램 구현

//					할인율은 계절마다 다르며 다음과 같다.

//					봄 : 20% 할인 - 3, 4, 5월
//					여름 : 할인 없음(0%) - 6, 7, 8월
//					가을 : 5% 할인 - 9, 10, 11월
//					겨울 : 30% 할인 - 12, 1, 2월
//					이상한 값이 입력되는 경우는 고려하지 않습니다.		


