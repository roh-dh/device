package basic;

public class Test15 {

	public static void main(String[] args) {
//		문자 자료형(char)  - 2byte	미국에서 아스키(ASCII) -> 유럽 확장 아스키 -> (지역마다 유니코드 완성형 한글 MS949)
		
		char a = 65;
		System.out.println(a); 	 // 결과값 
		char b = 'A';
		System.out.println(b);  
		int c = '가';							//완성형 한글 MS949
		System.out.println(c);
		int d = '힣';
		System.out.println(d);
		System.out.println(d-c+1); 			//가부터 힣까지 갯수

/*
 유니코드 : 전세계 국가에서 사용하기위한 코드표(지역별로 존재)
 		UTF-8			MS949					EUC-KR
		조합형			완성형					완성형
														완성형한글에서 자주사용하지않는것을 제거
 		조립식한글		완성형한글				
		Linux				window
		github			

  		ㅇ 1byte			안 2byte					
		ㅏ 1byte			안녕하세요 10byte
		ㄴ 1byte
		
		
		*/
	}

}
