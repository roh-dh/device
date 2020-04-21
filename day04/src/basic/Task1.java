package basic;

public class Task1 {

	public static void main(String[] args) {
/*		영화관 이용 요금은 다음과 같습니다.

		성인 : 10000원 청소년 : 7000원
		성인 2명, 청소년 3명이 영화를 보러가서 제휴카드로 25% 할인을 받았습니다.

		결제금액을 구하여 출력하세요

		(10원, 1원단위는 버립니다)
*/

int adult = 10000, youth = 7000 ;
int adultCount = 2, youthCount = 3;
double sale = 1-0.25;

double price = (adult*adultCount + youth*youthCount) * sale;
price = (int)price /100;
price = price*100;

System.out.println((int)price);

	}

}
