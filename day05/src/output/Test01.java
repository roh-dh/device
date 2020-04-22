package output;

import java.lang.*;

public class Test01 {
	public static void main(String[] args) {

//입출력
//ㅡ>CPU : 입력				키보드(System. in) // 마우스는 입력장치이나 (GUI)이기 때문에 cmd(커맨드)에서 사용할 수 없다.
// CPU ㅡ>	HDD ... : 출력	모니터(System. out), 스피커, 프린터

//		표준 출력 - 표준 출력 통로(Standard out stream)(System.out)를 이용하여 값을 내보내는 작업
//		내부 글자를 있는 그대로 출력하는 명령
		System.out.print("안");
		System.out.print("녕\n");
		
//		글자를 출력한 뒤 엔터를 추가해주는 명령
		System.out.println("반가워요");
		System.out.println("잘부탁드려요");

//		안좋은점 : 이어서 출력하고 싶으면 + 를 사용해야 한다(문자열)
		int age = 10;
		System.out.println("당신의 나이는 "+age+"살입니다.");
		System.out.println("10년 뒤 당신은 "+age+10+"살입니다"); // String+int+int+String= String+int를 먼저 계산
		System.out.println("10년 뒤 당신은 "+(age+10)+"살입니다");	// String +(int+int) + String = 
		
		
	}

}
