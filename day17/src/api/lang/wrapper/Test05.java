package api.lang.wrapper;

public class Test05 {

	public static void main(String[] args) {
//		주의사항 : Integer만 가질 수 있는 값이 있다.
//		-null이 포함된 계산을 할 경우 int 사용 불가(예외 발생)
		
		Integer a = null;
//		int b = null; 오류
		int b = a;
		System.out.println(b);
	}
}
