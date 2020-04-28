package loop2;

import java.lang.*;
import java.util.*;

public class Test03 {
public static void main(String[] args) {
	

// (1) 1부터 100까지 정수
/*for(int i=1; i<=100; i++) {
	System.out.println(i); 
} */
	
// (2) 1부터 100까지 홀수
/*1부터 100까지 2씩증가 					50번 실행해서 빠르긴하지만 생각을 많이해야되서 복잡한 표현하기 힘듬	
for(int k=1; k<=100; k+=2) {
	System.out.println("홀수2 = "+k);
}  */
/*for(int j=1; j<=100; j++) {    				// 100번실행+ if문100번실행해서 느리긴하지만 생각을 조금만해도되서 복잡한 표현을 하기 쉬움
	if(j%2!=0) {
		System.out.println("홀수 = "+j);		
			}
}*/

//	(3) 1부터 100까지 3의 배수
/*for(int c =1; c<=100; c++) {
	if(c%3==0) {
	System.out.println(c);
	}
}*/

//	(4) 모든 대문자 알파벳
/*for(int i=65; i<=90; i++) {
		System.out.println("알파벳(1) = "+(char)i);
	}

for(char d = 'A'; d<='Z'; d++) {
	System.out.println("알파벳(2) = " +d);
}*/
// 모든 한글
for(char f = '가'; f<='힣'; f++) {
	System.out.println(f);
}

	

	
	}

}
