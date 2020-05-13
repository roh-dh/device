package api.lang.string;

public class Test03 {
	public static void main(String[] args) {

// 문자열 검사	
// - ??? 으로 시작하나요 .startsWith()
// - ??? 으로 끝나나요 .endswith
// - ??? 이 들어있나요 .contatins() , .indexOF()
// - 길이는 얼마인가요? .length()

		String url = "http://www.naver.com";
//		이 문자열은 올바른 홈페이지 주소인가요?

		System.out.println(url.startsWith("http://"));
		System.out.println(url.startsWith("https://"));

		System.out.println(url.endsWith(".com"));
		System.out.println(url.endsWith(".net"));
		
		
		System.out.println(url.contains("naver")); //있나요?
		System.out.println(url.indexOf("naver")); //어디에 있나요?
		
		System.out.println(url.length());
		
		//마지막 글자가 뭐에요?
		System.out.println("마지막 글자가 뭐메요");
		System.out.println(url.charAt(url.length()-1));

		//첫번째 글자가 뭐에요?
		System.out.println("첫번째 글자가 뭐에요");
		System.out.println(url.charAt(0));
	}
}
