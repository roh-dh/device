package api.lang.wrapper;

public class Test03 {
	public static void main(String[] args) {
//		auto-boxing, auto-unboxing
//		int와 Integer처럼 하이브리드 지원이 필요한 상황이면 자동 변환을 수행
		Integer a = 10;  // int ---> Integer      auto-boxing
		Integer b = 20;
		Integer c = a+b;      //Integer ---> int     auto-unboxing

		System.out.println(c);
		long d =10; //int ---> long(o)
//		Long e = 10; // int ---> Long(x)
		Long e = 10L; //long ---> Long(o)
		
		
//		Integer a = new Integer(10);
//		Integer b = new Integer(20);
//		Integer c = Integer.sum(a, b);
		System.out.println(c.toString());
		
	}
}
