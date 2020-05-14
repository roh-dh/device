package api.lang.string;

public class Test09 {
	public static void main(String[] args) {

//	 문자열에서 절대 하면 안되는 행동
//	- 문자열에서 +는 "연결"을 의미한다.
//	- 연결을 남발하면 안됩니다.
		
//	hello를 10000번 더하는 프로그램
	String str = "";
	
	long start = System.currentTimeMillis(); //시작시각 측정
	
	str +="hello\n";
	for(int i=0; i<30000; i++) {
		str += "hello\n";
	}
	
	long finish = System.currentTimeMillis(); //종료시각 측정
	
	System.out.println(str);
	
	System.out.println(start);
	System.out.println(finish);
	System.out.println(finish-start);
	
	}
}
