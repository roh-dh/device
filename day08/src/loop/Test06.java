package loop;

import java.lang.*;

public class Test06 {

	public static void main(String[] args) {
		
//1부터 1000까지 합계를 구하여 출력하세요.		
int total = 0;
int n = 1;		//1부터 1000까지 더한값
		while(n<=1000) {
			total += n;
			n++;
		}

		System.out.println("정답 : "+total);
		
		
		
		
	}

}
