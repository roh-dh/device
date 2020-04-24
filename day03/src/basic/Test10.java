package basic;

public class Test10 {
/*	Test10.java
	주차장 요금은 10분에 500원입니다.
	10분 단위로 500원씩 늘어나며, 10분이 되기 전까지는 요금이 부과되지 않습니다.
	(ex : 10분부터 19분까지는 모두 500원입니다)\

	10시 45분에 주차장에 들어온 차가 17시 20분에 나가려고 할 때, 이 차의 주차요금을 계산하여 화면에 출력해주세요
	*/
public static void main (String[] args) {
//	준비
	int inHour = 10, inMinute = 45;
	int outHour = 17, outMinute = 20;



//	int totalprice = ((exit-enter-9)/10*fee+fee);
//		계산 :  이용시간구하기
	int inTime = inHour * 60 + inMinute;  		//진입시간(분)
	int outTime = outHour * 60 + outMinute;	//진출시간(분)
	int time = (outTime - inTime);					//이용시간 : 진출시간- 진입시간
	int fee = 500;											//주차장요금(원)

	int price = (time/10*fee);
//		결과
	System.out.println(price);
}
}
