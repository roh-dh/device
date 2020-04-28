package loop2;

public class Test08 {

	public static void main(String[] args) {

// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,		

// -황금비율 계산할 때 사용
// -처음 2자리 숫자는 무조건 1
// -3번째 자리부터는 앞의 두자리 숫자를 더한 결과가 해당 자리의 값	
// -30번째 자리의 숫자가 뭔지 구해서 출력

//	[1] 1,2번째 자리가 1이다(고정)		
		int a =1;   //1번째
		int b =1;   //2번째
		int c =a+b;  //3번째

//		[1] 3번째 자리는 1번째와 2번째 자리의 합이다(규칙)
		for(int i =3 ; i <= 30 ; i++) {

			
		System.out.println(a); // 1번째
		System.out.println(b); // 2번째
		System.out.println(c); // 3번째
				
		a = b;  
		
		b = c; 
				
		c = a +b;  //4번째
		
		}
		
		
	}

}
