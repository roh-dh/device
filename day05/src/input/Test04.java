package input;

import java.lang.*;
import java.util.*;

public class Test04 {
	public static void main(String[] args) {
//	Scanner(문자열) 입력
//	- 단어 입력 : 스페이스, 엔터등의 공백 기준 		예) 날씨가 좋네요 : 날씨가(1) 좋네요(2) 2개
//	- 문장 입력 : 엔터 기준

//	sc.next();			
//	- 공백을 만나면 그 앞에 있는 글자를 가져오고 끝
//	sc.nextLine();	
//	- 엔터(개행문자)를 만나면 그 앞에 있는 글자를 가져오고 끝
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력");
		String name = sc.next();

		System.out.println("입력하신 이름은 "+name);
		
		sc.nextLine(); //엔터제거
		
		System.out.println("문장 입력");
		String line = sc.nextLine();
		
		System.out.println(line);
		
		sc.close();
		
		
	}
}
