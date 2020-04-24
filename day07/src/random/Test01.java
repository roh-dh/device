package random;

public class Test01 {
	public static void main(String[]args) {
//무작위 값. 예측이 불가능한 값.		
//-		Math.random(); ㅁ여령을 이용한 랜덤 추ㅜㄹ
//-		Random;
		double a = Math.random();			
		double b = a* 10;
		int c = (int)b;
		int d = (int)c+1;
		
		System.out.println(a); //0.xxx<=a<0.9xxx
		System.out.println(b); //0.xxx<=a<9.xxx
		System.out.println(c);	//
		System.out.println(d);
//		a~d를 합쳐서 만들면		
//		int e = (int)(Math.random()* 10개) +1부터;		
		
	
	}

}
