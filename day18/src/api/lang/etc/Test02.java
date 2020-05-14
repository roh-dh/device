package api.lang.etc;

public class Test02 {
	public static void main(String[] args) {
//		System 클래스
//		- System.out : 표준 출력 통로
//		- System.in : 표준 입력 통로
//		- System.err : 표준 에러 통로
		System.out.println("안녕하세요");
		System.err.println("안녕못해요");
		
//		기준시(1970-01-01 00:00:00.0)부터의 밀리초
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		System.out.println(System.getProperties());
		System.out.println(System.getProperty("java.runtime.version"));
		System.out.println(System.getProperty("os.name"));
		
		if(!System.getProperty("os.name").toLowerCase().contains("windows")) {
			System.err.println("윈도우에서만 작동 가능합니다");
			System.exit(0);//프로그램 종료
		}
		else {
			System.out.println("현재 윈도우를 사용하고 있습니다");
		}
		
		//0은 정상종료, 나머지는 비정상종료임을 시스템에 알려준다
		System.exit(0);
		
		System.out.println("나와요 안나와요");
		
		System.gc();//gc 가동(가비지 컬렉터)
	}
}