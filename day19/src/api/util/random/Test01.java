package api.util.random;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random r = new Random();
		
//		System.out.println(r.nextDouble()); //==math.random()
//		System.out.println(r.nextGaussian()); //가우시안 분포(정규분포)
		
		Random r2 = new Random(1L);
		System.out.println(r2.nextInt());
	}
}
