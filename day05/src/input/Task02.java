package input;
import java.lang.*;
import java.util.*;
public class Task02 {
	public static void main(String[] args) {
		//1. 충전금액을 입력받고, 충전할 시간을 입력받는다.
				Scanner sc = new Scanner(System.in);
				System.out.println("충전 금액");
				int fee= sc.nextInt();
				System.out.println("충전 시간");
				int time = sc.nextInt();
				sc.close();
		//2. 계산 
				//실제충전된시간= 분단위로 변경 후 시간과 분으로 나눠준다
				//거스름돈 = 충전금액에서 충전시간*1000한 값을을 빼준다.
				int totaltime	= time*70;
				int hour			=	totaltime/60;
				int minute		=	totaltime%60;
				int change		=	fee-(time*1000);
		//3.	 출력 :실제충전된 시간, 거스름돈
				System.out.println("실제충전된 시간 =  "+hour+"시간"+minute+"분");
				System.out.println("거스름돈 = "+change+"원");
	}
}

