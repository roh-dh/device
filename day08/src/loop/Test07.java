package loop;

public class Test07 {
	public static void main(String[] args) {

//		30일동안 다이어트를 위해서 푸쉬업을 할 계획입니다.
		
//		첫날에는 10개만 하고 다음날부터는 전날보다 3개씩 더 할 계획입니다.
		
//		(1) 일자별로 하게되는 푸시업 개수를 구해서 출력
//		(2) 30일동안 하게되는 푸시업 개수를 구해서 출력
		
		int pushup = 10;		//최초에 10개 설정
		int day = 1;			
		int total = 0;  //합계 변수
				
		while(day<=30) {					//day가 30이하이라면 반복  
			
//			 3개씩 반복적으로 더한다.
			
			System.out.println(day+"일차 "+pushup+"개");

			total +=pushup;		// 날짜가 바뀌기전에 첫날에 10개를 했음.

			day++;					// 날짜가 바뀜

			pushup += 3;			// 날짜가 바뀐 다음에 푸쉬업 개수가 늘음 
		}
		System.out.println("총 푸쉬업개수 : "+total+"개");
		
	}
}
