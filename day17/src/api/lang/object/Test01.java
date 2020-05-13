package api.lang.object;

public class Test01 {
	public static void main(String[] args) {
//	남이 만든 클래스인 Object 사용
		Object a = new Object();

		String b = a.toString(); // 객체 요약정보
		System.out.println("객체 요약정보 반환 : "+b);

		int c = a.hashCode(); // 일련번호 반환
		System.out.println("일련번호 반환 : "+c);

		Object d = new Object();
		System.out.println(d.hashCode());
		
	}
}
