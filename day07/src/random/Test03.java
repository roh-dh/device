package random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		
		Random r = new Random();
		//주사위 1부터 6까지 1부터 6개
		int dice = r.nextInt(6/*개*/)+1/*부터*/;		
		System.out.println("주사위 " + dice);

		//로또 1부터 45까지 1부터 45개
		int lotto = r.nextInt(45/*개*/)+1/*부터*/; 	
		System.out.println("로또 ="+ lotto);
		
		// 두자리 정수 10부터 99까지 10부터
		int i = r.nextInt(99-10+1/*개*/)+10/*부터*/; 
		System.out.println("두자리 정수 = "+i);

		// 000000부터 999999까지 0부터 1000000 
		int otp = r.nextInt(100000/*개*/)/*부터*/; 
		System.out.println("OTP번호 = "+otp);
		
		
		
	}
}
