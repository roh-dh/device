package array;

import java.util.*;

public class Test08 {
	public static void main(String[] args) {

//사용자에게 10개의 숫자를 입력받아서 "짝수"와 "홀수"를 각각 구분하여 출력

//짝수합, 홀수합도 각각 따로 구해서 출력하세요.

// [1] 10개의 숫자를 입력받아서 구분
		Scanner sc = new Scanner(System.in);

		int[] d = new int[10];
//		d -------------------->[ 0 ][ 0 ][ 0 ][ 0 ][ 0 ][ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]
//									+0 +1  +2  +3  +4  +5 +6  +7 +8  +9  
		
		System.out.println("사용자가 입력한 값");
		for(int i =0 ; i<10 ; i++) {
			d[i] = sc.nextInt();
			
		}
/*		d[0] = sc.nextInt()
		d[1] = sc.nextInt();
		d[2] = sc.nextInt();
		d[3] = sc.nextInt();
		d[4] = sc.nextInt();
		d[5] = sc.nextInt();
		d[6] = sc.nextInt();
		d[7] = sc.nextInt();
		d[8] = sc.nextInt();
		d[9] = sc.nextInt(); */
		
/*		String str;
		if (d[i] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}				*/
		
/*		if (d[0] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		if (d[1] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		if (d[2] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		if (d[3] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		if (d[4] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		if (d[5] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		if (d[6] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		if (d[7] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		if (d[8] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		if (d[9] % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
*/				

//		sc.close();
/*		System.out.println("n1 : " + str);
		System.out.println("n2 : " + str);
		System.out.println("n3 : " + str);
		System.out.println("n4 : " + str);
		System.out.println("n5 : " + str);
		System.out.println("n6 : " + str);
		System.out.println("n7 : " + str);
		System.out.println("n8 : " + str);
		System.out.println("n9 : " + str);
		System.out.println("n10 : " + str); */
		
	}
}
