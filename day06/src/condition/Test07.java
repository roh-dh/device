package condition;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		System.out.println("출생년도를 입력하세요.");
 int born = sc.nextInt();
sc.close();
int age = 2020-born+1;


int deposit = 500; // 보증금

int fr = deposit;
int ad = 1250+deposit;
int te = 720+deposit;
int ch = 450+deposit;

boolean isFr = age>=65 || age<=7;
boolean isAd = age >=20;
boolean isTe = age >= 14;
boolean isCh = age >= 8;

System.out.println("귀하의 나이는 "+ age+"세입니다");

if(isFr) {
	System.out.println(fr);
} else if(isAd) {
	System.out.println(ad);
} else if(isTe) {
	System.out.println(te);
} else if(isCh) {
	System.out.println(ch);
} else {
	System.out.println("다시 입력해주세요.");
}

//System.out.println("지불하실 요금 : ");

	}

}
