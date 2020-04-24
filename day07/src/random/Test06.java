package random;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String[]args) {
		Random r = new Random();
		System.out.println("다음 구구단을 계산하세요.");
		int a = r.nextInt(9-2+1)+2;
		int b = r.nextInt(9-1+1)+1;
		System.out.print(a+"*"+b);
		
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		
		sc.close();
//만약에 d에서 입력한 값이 a*b이면 맞습니다.
		
		if(d==a*b) {
			System.out.println("맞았다.");
		} else {
			System.out.println("틀렸다.");
		}
		
	}

}
