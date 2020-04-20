package basic;

public class Test10 {
/*	Test10.java
	주차장 요금은 10분에 500원입니다.
	10분 단위로 500원씩 늘어나며, 10분이 되기 전까지는 요금이 부과되지 않습니다.
	(ex : 10분부터 19분까지는 모두 500원입니다)\

	10시 45분에 주차장에 들어온 차가 17시 20분에 나가려고 할 때, 이 차의 주차요금을 계산하여 화면에 출력해주세요
	*/
public static void main (String[] args) {
	int enterHour = 10, enterMinute = 45;
	int exitHour = 17, exitMinute = 20;
	int enter = enterHour * 60 + enterMinute; 
	int exit = exitHour * 60 + exitMinute;
	int fee = 500;

//	int totalprice = ((exit-enter-9)/10*fee+fee);
	int totalprice = ((exit-enter)/10*fee);

	System.out.println(totalprice);
}
}
