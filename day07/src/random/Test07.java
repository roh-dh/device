package random;

import java.util.Random;

public class Test07 {
	public static void main(String[] args) {
//랜덤 카드뽑기
		
//프로그램을 시작하면 랜덤으로 카드한장이 화면에 출력되도록 코드를 구현
		
// -모양 : 하트, 다이아, 클로버, 스페이드
// - 숫자 : A, 2 , 3, 4, 5, 6, 7, 8, 9, 10 ,J, Q, K

// 하트0,다이아1,클로버2,스페이드3
// 숫자 A1 2~10 11J 12Q 13K
		//모양의 경우의수를 구하고 숫자의 경우의수를 구한다.		



Random r = new Random();

System.out.println("당신이 뽑은 카드는 ");
int shape = r.nextInt(4);
int number = r.nextInt(13) +1; //2부터10까지 경우의수


//만약에 당신이 뽑은 카드가 0
String str;
String str2;

if(shape==0) {
	str = "하트";
} else if(shape==1) {
	str ="다이아";
} else if(shape==2) {
	str ="클로버";
} else {
	str ="스페이드";
}

if(number ==1) {
	str2 ="A";
} else if (number == 11) {
	str2 ="Q";
} else if (number == 12) {
	str2 ="K";
} else {
	str2 = "" +number ;
}



//출력
	System.out.print(str+" "+str2);
}

}
