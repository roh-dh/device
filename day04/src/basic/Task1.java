package basic;

public class Task1 {

	public static void main(String[] args) {
/*		keypoint 
 		1. 버림, 반올림, 올림하는 법
		2. 할인율 구할때 dobule은 오차가 있을 수 있으니 int를 사용하자.
		2. 예) 0.25 = 25 / 100
		
		영화관 이용 요금은 다음과 같습니다.

		성인 : 10000원 청소년 : 7000원
		성인 2명, 청소년 3명이 영화를 보러가서 제휴카드로 25% 할인을 받았습니다.

		결제금액을 구하여 출력하세요

		(10원, 1원단위는 버립니다)
*/
//	준비
int adultPrice = 10000, teenPrice = 7000 ;
int adultCount = 2, teenCount = 3;
//	계산 : 성인요금(원), 청소년요금(원), 총 요금(원), 할인 요금(원)
int adultTotal = adultPrice * adultCount;
int teenTotal = teenPrice * teenCount;
int total = adultTotal +teenTotal;
				//double sale = 0.75 dobule은 오차가 있기때문에 사용하면 안됨 int로 푸는 습관을 들이자.
int discount = total * 25 / 100;
int result = total -discount;
//출력
				//double price = (adult*adultCount + youth*youthCount) * sale;
//10의자리 이하를 삭제
result = result / 100 * 100; 		  // 버림
//result = (result + 50) / 100 * 100; // 반올림
//result = (result + 99) / 100 * 100; // 올림

System.out.println(result);

	}

}
