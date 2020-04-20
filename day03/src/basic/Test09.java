package basic;

public class Test09 {

	public static void main(String[] args) {
/*
Test09.java
당구장 요금표는 다음과 같습니다.

시간	요금
30분당	1000원

시간	요금
~29분	1000원
~59분	2000원
...	...
당구장을 3시간 35분 이용한 경우 발생하는 요금을 출력하세요  
 */

		
		
int price = 1000;

int playtime = (3*60+35)/30 ;

int totalprice = (playtime)*price+price;


System.out.println(totalprice);
		
	}

}
