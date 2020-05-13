package api.lang.wrapper;

public class Test04 {
	public static void main(String[] args) {
// 		주의사항 : 객체 비교는, equals() 메소드를 사용한다.
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
//		Q: a와 b는 같습니까?
		System.out.println(a==b); //동일한가? 당산에 있는 홍콩반점이랑 전북대에 있는 홍콩반점이랑 '동일'한가? 아니요.

		//객체를 비교할때는 이렇게...
		System.out.println(a.equals(b)); //동등한가? 당산에 있는것도 홍콩반점 전북대에 있는 홍콩반점. 
		
		
	}
}
