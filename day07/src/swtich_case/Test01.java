package swtich_case;

import java.lang.*;
import java.util.*;

public class Test01 {
	public static void main(String[] args) {
// switch~case를 이용한 가위바위보
// 가위(0), 바위(1), 보(2) - 0부터 3개
		
		Random r = new Random();
		int rsp = r.nextInt(3);
		System.out.println("rsp = "+ rsp);
// switch는 "책갈피"다!	
//		똑같은 반응속도를 필요로할때 예) 키보드 마우스
		
		switch(rsp) {
		case 0: 
		 System.out.println("가위");
		 break;
		case 1:
			System.out.println("바위");
			break;
		default : 
		System.out.println("보");
		break;
		
		
		}
	}
}
