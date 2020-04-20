package basic;

import java.util.Calendar;
public class Test07 {
	public static void main(String[] args) {

/* 생년월일이 8자리 정수로 주어져 있다고 가정합니다.
	(예 : 19930730)
	
	주어진 값을 이용하여 다음 항목들을 출력
	- 출생년도
	- 월
	- 일
	- 나이(한국식)
	- 만나이
	*/
		//입력
			int birthday = 19930730;
		//올해 연도 구하기
			int thisYear = Calendar.getInstance().get(Calendar.YEAR);
			
		//계산    																	나누기= 앞자리 / 나머지= 뒷자리를 구할때 
			
			int year = birthday / 10000;
			int month = birthday / 100 % 100; 
			int day = birthday % 100;
			int KoreanAge =  thisYear - year +1;
			int age = (20200420 - birthday)/10000;
			
		//출력
				
				System.out.println(thisYear);
				System.out.println(year);
				System.out.println(month);
				System.out.println(day);
				System.out.println(KoreanAge);
				System.out.println(age);

	}
}
