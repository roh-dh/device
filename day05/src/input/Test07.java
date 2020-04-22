package input;

import java.lang.*;
import java.util.*;

public class Test07 {
	public static void main(String[] args) {

		// 사용자에게 "닉네임"을 입력받는 프로그램을 구현합니다.
		
		// 입력받은 "닉네임"을 화면에 출력하고, 닉네임이 우리의 기준에 맞는기 검사를 수행하여 결과를 출력
				
		// (기준) 2글자 이상 8글자 이하일 때만 올바른 닉네임으로 판정

		//	(출력) 사용자가 입력한 닉네임, 닉네임의 글자수, 판정 결과	

//	준비
Scanner sc = new Scanner(System.in);
System.out.println("닉네임을 입력하세요");
		 String nickname = sc.next();
		 sc.close();
// 계산

		boolean isCorrect = (2 <= nickname.length()) && (nickname.length() <= 8);
//출력		
		System.out.println("닉네임은 "+nickname);
		System.out.println("닉네임길이 "+nickname.length());
		System.out.println("닉네임을 사용할수 있는지?"+isCorrect);
	}

}

