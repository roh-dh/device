package basic;

public class Task3 {

	public static void main(String[] args) {

//				아무 글자나 하나 char 형태에 저장하시고 문제를 푸세요.
				char a = '노';

//				(1) 저장한 값이 "숫자"라면 true , 아니라면 false를 출력
					// System.out.println((int) '0'); 48
					// System.out.println((int) '9'); 57
				boolean number = (48 <= a) && (a <= 57);
				System.out.println(number);

//				(2) 저장한 값이 "한글"이라면 true, 아니라면 false를 출력

		//1. 자음일때 :ㄱ~ㅎ
					// System.out.println((int)'ㄱ');	12593
					// System.out.println((int)'ㅎ');	12622
				boolean consonant = (12593 <= a) && (a <= 12622);
				System.out.println(consonant);
		//2. 모음일때 : ㅏ~ㅣ
					// System.out.println((int)'ㅏ');	12623
					// System.out.println((int)'ㅣ');	12643
				boolean vowel = (12623 <= a) && (a <= 12643);
				System.out.println(vowel);
		//3. 완성형문자일때 : 가~힣
					// System.out.println((int)'가'); 44032
					// System.out.println((int)'힣'); 55203
				boolean completeCharater = (44032 <= a) && (a <= 55203);
				System.out.println(completeCharater);

	}

}
