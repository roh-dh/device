package api.lang.string;

public class Test05 {
	public static void main(String[] args) {

//	문자열 편집
//	-대소문자 변환
//	-불필요한 여백제거
//	-치환	
		
		
	String str = "Hello java!";
	System.out.println(str.toLowerCase());		//네이버 대문자를 입력해도 소문자로 바뀌어서 홈페이지에 접속된다.
	System.out.println(str.toUpperCase());	
	
	String url = "         http://WWW.         NAVER.cOM               ";		//1번 3번삭제.
					//1번				 2번				   3번
	System.out.println(url.trim());		//불필요한 여백 제거.
	
	System.out.println(url.toLowerCase().trim());
	
	String test = "나는 자바가 좋아요";
	System.out.println(test);
	System.out.println(test.replace("자바", "피자"));
	
	test = test.replace("자바","피자");
	
	System.out.println(test.replace("좋아", "싫어"));
	
	
	}
}
