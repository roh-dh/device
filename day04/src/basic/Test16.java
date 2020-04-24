package basic;

import java.lang.*;

public class Test16 {

	public static void main(String[] args) {
//		문자열 : String
		
		String a = "hello";
		System.out.println(a);	

		

//		원시형 - 공장에서 생산하는 종이컵처럼 딱 정해진 '틀'에 맞춰진 형태
//		참조형 - 리모콘처럼 다양한 기능이 내장되어 있다. a.length a.toUpperCase...
		System.out.println(a.length()); //글자수
		System.out.println(a.toUpperCase()); //대문자 변환
		System.out.println(a.charAt(1)); // 문자가 어디에(At) 있는지를 알려주는 함수

/*		\와 조합하여 각종 유용한 명령을 처리(escape sequence)
		-	\t : 	탭키효과
		-	\n : 	엔터키(개행) 효과
		-	\" : "	글자를 입력한 효과
		-	\\ : \ 글자를 입력한 효과
*/		
//		나는 "피자"가 먹고 싶어요 를 문자열 변수에 저장한 뒤 출력
		System.out.println("나는 \"피자\"가 먹고싶어요.");	//문자열에 ""를 넣고싶을때  
																				//\ escpase sequence 이스케이프 문자
		String c = "이름\t\t성별";			//\t =tab키
		String d = "원빈\t\t남자";
		String e = "이나영\t여자";
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
