package api.lang.object;

public class Test03 {
	public static void main(String[] args) {
		Sample s = new Sample();

//		이론상 s가 가진 구성요소는 없어야 한다

		System.out.println(s.getClass());
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		
		
	}
}
