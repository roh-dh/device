package swtich_case;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

// 사용자에게 연도를 입력받아 해당하는 연도의 무작위 날짜 1개를 출력

// 윤년일 경우 2월은 29일까지 있고, 윤년이 아닐 경우 2월은 28일까지 있습니다.

//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");

		int year = sc.nextInt();
		sc.close();
		
// 해당하는 연도의 무작위 날짜 1개를 출력
Random r = new Random();
int month = r.nextInt(12-1+1)+1; // 무작위 월 


//윤년 int	 leapYear;
// 만약에 2월일때 leapYear==1이라면 28일까지 있다. else(하지만 leapYear==0이라면) 29일까지 있다.
// month가 4,6,9,11 30일까지 있다.
// 그렇지않으면 1,3,5,7,8,10,12라면 31일까지 있다

//윤년인경우 : 
//연도가 400의 배수이면 무조건 윤년입니다. T ->?->?-> T   2번째와 상관없이 (||) true 
// 1번이 아닐 경우 연도가 100의 배수이면 윤년이 아닙니다. F->T->T->T  // F->T
// 1,2번이 아닐 경우 연도가 4의 배수이면 윤년입니다. 

int leapYear;			//윤년 1=윤년(29일) 2=윤년X (28일)
if(year%400==0 || year%100!=0 && year%4==0 ) {  
	leapYear=1; //1일때 윤년
} else { //1이 아니면 
	leapYear=0; // 윤년아님
}

int day;
if (month==2) { 					//2월일때
	if(leapYear==1) {				//윤년이라면
	day =r.nextInt(29-1+1)+1;	//1일부터 29일까지 무작위로 뽑는다..
}	else {								//윤년이아니면
		day= r.nextInt(28-1+1)+1; //1일부터 28일까지 무작위로 뽑는다.
	} 
	} else if(month== 4 || month==6 || month==9 || month==11) { //4,6,9,11월일때
	day = r.nextInt(30-1+1)+1; // 1일부터 30일까지 무작위로 뽑는다.
	} else  // 2,4,6,9,11월을 제외한 월일때
		day = r.nextInt(31-1+1)+1; //1일부터 31일까지 무작위로 뽑는다.



// 출력
System.out.println(year+"년"+month+"월"+day+"일");

		
		
	}
}
