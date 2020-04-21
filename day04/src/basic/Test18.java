package basic;

public class Test18 {

	public static void main(String[] args) {
//		논리 연산
		
		int score = 70;
		
//		(1) 60점 이상인가?
//		(2) 100점 이하인가?

//		그리고 : && 			
//		또는 : || 		
		boolean pass = ( 60<= score ) && (score <= 100);


		System.out.println(pass);
	}

}
