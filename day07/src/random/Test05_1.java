package random;

import java.util.Random;

public class Test05_1 {

	public static void main(String[] args) {
// 3.윷놀이 1턴 구현(4개의 윷을 분리해서 생각)
// -안뒤집힌 경우(0) , 뒤집힌경우(1)		
		Random r = new Random();
		
		int a = r.nextInt(2);
		int b = r.nextInt(2);		
		int c = r.nextInt(2);
		int d = r.nextInt(2);
		System.out.println(""+a+b+c+d);		//윷놀이에서만 적용할 수 있다.
		System.out.println(+a+b+c+d);
		int total = a + b + c + d;
		String yut;
		if(total == 1) {
			yut = "도";
			if(a==1) {
			yut = "빽도";
			}
			
		} else if(total ==2) {
			yut = "개";
		} else if(total ==3) {
			yut = "걸";
		} else if(total ==4) {
			yut = "윷";
		} else {
			yut = "모";
		}
		System.out.println(yut);
	}
}
