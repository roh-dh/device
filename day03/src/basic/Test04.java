package basic;

public class Test04 {

	public static void main(String[] args) {
//		변수(variable)를 사용하여 프로그래밍
//		- 코어 데이터(core data)가 무엇인지 찾아야 한다.
		
		int dailyPrice = 8000; 	//a라는 이름으로 8000을 저장하겠다.
		int term = 30;		//b라는 이름으로 30을 저장하겠다.
		int sale = 5000;	//c라는 이름으로 5000을 저장하겠다.
		
		int price = dailyPrice*term;   
		
		System.out.println(price ); // 할인 전
		System.out.println(price - sale ); // 할인 후
		
		

	}

}
