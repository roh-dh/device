package basic;

public class Test06 {

	public static void main(String[] args) {
//편의점에서 900원짜리 삼각김밥을 1+1 행사로 판매하고 있습니다.
//행사 중인걸 모르고 5개를 가지고 가면 내야할 돈이 얼마 인가요?
  
/* 개수 	유료 	무료 	n%2
  	1		1 		0 		
  	2		1		1				
	3		2		1																					
	4		2		2		
	5		3		2 
	6		3		3
	7		4		3
					n/2
	
		int gimbob = 900, n= 5, div = n/2, mod = n%2 ;
		int total = gimbob*div+gimbob*mod;
		System.out.println(total);
	

		//편의점에서 900원짜리 삼각김밥을 2+1 행사로 판매하고 있습니다.
		//행사 중인걸 모르고 5개를 가지고 가면 내야할 돈이 얼마 인가요?	
*/			
		/*
		개수 			유료				무료
		1				1					0
		2				2					0
		3				2					1
		4				3					1
		5				4					1
		6				4					2
		7				5					2
		8				6					2
		9				6					3
		..
		n									n/3									
		*/					
//준비
int price = 900;		//1개당 구매가격
int count = 5;			//구매 갯수
//계산
int freeCount = count/3; 			//무료 개수
System.out.println(freeCount);
int totalPrice = price*(count-(freeCount));

//출력
System.out.println(totalPrice);  

		/*
개수	유료	무료
1 		1 		0 
2 		2 		0 

3 		2 		1 
4		3 		1 
5 		4 		1 

6 		4 		2
7 		5		2
8 		6		2
n     규칙x	3/n


		}

}
		
/*
//		준비
		int gimbabPrice = 900;
		int gimbabCount = 5;
		
// 		계산 : 무료 개수
		int freeCount = gimbabCount / 2 ;
		int payCount = gimbabCount - freeCount;
		
		int price = payCount * gimbabPrice;
		
// 		출력
		System.out.println(price);
/*		
//		준비
		int gimbabPrice = 900;
		int gimbabCount = 5;
		
// 		계산 : 무료 개수
		int freeCount = gimbabCount / 2 ;
		int payCount = gimbabCount - freeCount;
		
		int price = payCount * gimbabPrice;
		
// 		출력
		System.out.println(price);
		*/
		
	}
	
	}		
		