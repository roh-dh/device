package basic;

public class task3 {

	public static void main(String[] args) {

//		아무 글자나 하나 char 형태에 저장하시고 문제를 푸세요.		
		
		
		char a = '9';					//한글 시작 부분
//		(1) 저장한 값이 "숫자"라면 true , 아니라면 false를 출력		

		boolean number =	(48 <= a) && (a<=57);
		System.out.println(number);

//		(2) 저장한 값이 "한글"이라면 true, 아니라면 false를 출력
		
		boolean kor = (12593 <= a) && (a <= 55203);
		System.out.println(kor);
		
		

	}

}
