package condition;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// 진입시간 진출시간입력
		Scanner sc = new Scanner(System.in);
		System.out.println("진입시간(시간)");
		int inHour = sc.nextInt();
		System.out.println("진입시간(분)");
		int inMin = sc.nextInt();

		System.out.println("진출시간(시간)");
		int outHour = sc.nextInt();
		System.out.println("진출시간(분)");
		int outMin = sc.nextInt();
		sc.close();

		// 분으로 환산.
		int inTime = (inHour * 60) + inMin; // 진입시간 분으로 환산
		int outTime = (outHour * 60) + outMin; // 진출시간 분으로 환산
		int stayTime = outTime - inTime; // 머무른 시간 (진출-진입시간)(분)

		/// 30분까지 무료
		int freeTime = 30; // 무료로 이용할수 있는 시간(분)

		int payTime = (stayTime - freeTime); // 지불해야할 시간(분)
		int pay = 1000;
		if (payTime > 101) {
			pay= 10000;
		} else if (payTime > 91) {
			pay -= 1000;
		} else if (payTime > 81) {
			pay -= 2000;
		} else if (payTime > 71) {
			pay -= 3000;
		} else if (payTime > 61) {
			pay -= 4000;
		} else if (payTime > 51) {
			pay -= 5000;
		} else if (payTime > 41) {
			pay -= 6000;
		} else if (payTime > 31) {
			pay -= 7000;
		} else if (payTime > 21) {
			pay -= 8000;
		} else if (payTime > 11) {
			pay -= 9000;
		} else if (payTime > 1) {
			pay -= 10000;
		}
		System.out.println(pay);

	}
}