package basic;

public class Test14 {

	public static void main(String[] args) {
//		실수의 특징

//		float a = 3.14; 	 3.14는 double형이기때문에 그보다 작은 float에 넣을 수 없다.
		float a = 3.14f;
		double b = 3.14;
		
		System.out.println(a);
		System.out.println(b);
	
		float c = 1.290312903812903210931239012381f;
		double d = 1.290312903812903210931239012381;
		System.out.println(c);			//순환형이 아님
		System.out.println(d);			//순환형이 아님
		System.out.println(10/3.0);		//실수형 특징: 부정확 결과값 3.3333333333333335이 나옴 3.33333333...

		float e = 1.5f;				
		long f = (long) e;		// float이 long보다 크기때문에 ()캐스트를 넣지않으면 안 들어간다.
		System.out.println(f);
		
		long g = 10L;
		float h = g;
		System.out.println(h);

	
	}

}
