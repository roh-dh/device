package input;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
//
		Scanner sc = new Scanner(System.in);

		System.out.println("주문한 커피 잔수");
		int coffeeCount = sc.nextInt();
		sc.close();


/*
1	1	0
2	2	0
3	3	0
..
7	7	0
8	7	1
n		n/8
*/
//준비
int coffeePrice = 1500;

//계산 유료커피잔수 = 커피잔수-무료커피잔수
int freeCoffee = coffeeCount / 8;		//무료커피잔수
int chargedCoffee = coffeeCount-freeCoffee;	//유료커피잔수
int result = chargedCoffee*coffeePrice;	//총 결제금액

//출력 무료로 제공되는 커피 잔수, 총 결제금액	= 유료커피잔수*금액
System.out.println("무료로 제공되는 커피 잔수는 "+freeCoffee+"잔입니다.");
System.out.println("총 결제금액은 "+result+"원입니다.");

	}

}
