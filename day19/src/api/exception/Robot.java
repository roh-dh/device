package api.exception;

public class Robot {
// 이 메소드는 "불안정한" 메소드 입니다.
// 언제든지 Exception이 발생할 수 있습니다.
	public static int div(int a, int b)throws Exception{
		return a / b;
			
	}
}
