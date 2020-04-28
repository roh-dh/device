package loop2;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

/*		int a = 3; // 대상숫자.

//		12%1 12%2 12%3 12%4 12%5....12%12 = 0 0 0 0 2... 0   
//		1로 나눴을때와 12로 나눴을때 이외(2,3,4,6)에도 나머지값이 0이므로 합성수다. 

//출력
		System.out.println("a : 합성수"); */
		
Scanner sc = new Scanner(System.in);
System.out.println("숫자를 입력하세요.(소수/합성수/1 중 판정)");
int a = sc.nextInt();
sc.close();

		int count = 0; // 1부터 a까지 나머지가 0인값을 찾아 세주기 위해서  : for(나머지 1부터  ;  a랑같은수가 될때까지 반복해라.(i<=a) ; 하나씩증가i++)
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		System.out.println("1부터 입력한 개수까지 나눠서 나머지가 0인 개수 : " + count);
//		만약에 count가 2가 된다면 (1로 나눈값과 a로 나눈값만 카운트 된다면) 소수
String str;
		if(count ==2) {
			str = "소수";
		} else if(count ==1){
			str = "1";
		} else {
			str = "합성수";
		}
			System.out.println("판정결과 입력하신 숫자는  '"+str+"'입니다.");
	}
}
