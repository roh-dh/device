package basic;

public class Task3 {

	public static void main(String[] args) {
		//비밀번호 형식검사, 닉네임 한글검사에 응용할수 있다!
		
//				아무 글자나 하나 char 형태에 저장하시고 문제를 푸세요.
				char a = 'a';

//				(1) 저장한 값이 "숫자"라면 true , 아니라면 false를 출력
		// 숫자인가?
				// System.out.println((int) '0'); 48
				// System.out.println((int) '9'); 57
//				boolean isNumber = (48 <= a) && (a <= 57);
				boolean isNumber = ('0'<= a ) && (a <= 9);
				System.out.println(isNumber);

//				(2) 저장한 값이 "한글"이라면 true, 아니라면 false를 출력

		//1. 자음인가? :ㄱ~ㅎ
					// System.out.println((int)'ㄱ');	12593
					// System.out.println((int)'ㅎ');	12622
//				boolean isConsonant = (12593 <= a) && (a <= 12622);
				boolean isConsonant = ('ㄱ'<= a) && (a <= 'ㅎ');
				System.out.println(isConsonant);
		//2. 모음인가? : ㅏ~ㅣ
					// System.out.println((int)'ㅏ');	12623
					// System.out.println((int)'ㅣ');	12643
//				boolean isVowel = (12623 <= a) && (a <= 12643);
				boolean isVowel = ('ㅏ'<= a ) && (a <= 'ㅣ');
				System.out.println(isVowel);
		//3. 완성형문자인가? : 가~힣
					// System.out.println((int)'가'); 44032
					// System.out.println((int)'힣'); 55203
//				boolean isCompleteCharater = (44032 <= a) && (a <= 55203);
				boolean isCompleteCharater = ('가'<= a ) && (a <= '힣');
				System.out.println(isCompleteCharater);

		//4. 한글인가?	
//				(자/모음에 해당?)  또는 (완전한글자?);
//				('ㄱ'과 'ㅣ' 사이인가?) 또는 ('가'와 '힣' 사이인가? );
				boolean isKor = ('ㄱ'<=a && a<='ㅣ') || ('가'<=a && a<='힣');
				System.out.println(isKor);

		//5. 알파벳인가?
				boolean isAlp = ('a'<=a && a<='z') ||  ('A'<=a && a<='Z');
				System.out.println(isAlp);
	}

}
