package basic;

public class Task2 {

	public static void main(String[] args) {
/*		20010715 라는 생년월일 값이 정수로 주어져 있을 때, 
  		해당하는 사람이 성인이라면 true, 
 		미성년자라면 false를 출력하도록 프로그래밍 하세요.
		(한국에서 성인은 한국 나이로 20세 이상입니다)
*/	
//			2001년생이 20살이 넘으면? 
//			2001보다 숫자가 낮으면 성인
//			2001보다 숫자가 높으면 미성년자


		
//		int born = 20010715/10000; 										//	       태어난 년도	
//		boolean adult = (0 <= born ) && (born <= 2001); 		//			2001보다 작으면 true

//		System.out.println(adult);
//		준비 : 생년월일
		int born = 20010715;
//		계산 : 올해-태어난해 +1 = 나이
		int thisyear = 2020;
		int bornyear = born/10000;

		int age = (thisyear-bornyear)+1;
		System.out.println(age);

		boolean adult = age >= 20;
//결과 
		System.out.println(adult);
	}

}
