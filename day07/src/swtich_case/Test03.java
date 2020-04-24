package swtich_case;

import java.lang.*;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		사용자에게 닉네임을 입력받고 입력받은 닉네임이 "운영자"인지 검사
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 닉네임을 입력하세요.");
		String nick =sc.next();
		sc.close();
		
/*		if(nick == "운영자") {
			System.out.println("운영자는 사용할 수 없는 단어입니다.");
		}
		else {
			System.out.println("사용할 수 있는 닉네임입니다."); 
		} */
		// 원시형(primitive) : 크기고정 byte short int long 컵 내용물 비교
		// 참조형	(reference) : 크기가변 						리모콘
		// 동등 != 동일
		switch(nick) {
		case "운영자":
			System.out.println("운영자는 사용할 수 없는 닉네임입니다.");
			break;
			default:
				System.out.println("사용할 수 있는 닉네임입니다.");
				break;
				
		}
	}

}
