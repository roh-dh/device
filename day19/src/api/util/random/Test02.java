package api.util.random;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {

		long time = System.currentTimeMillis();
		System.out.println(time/2000);
		
//		Random r= new Random(?); 
		Random r = new Random();
		r.setSeed(time /2000);
		
		System.out.println(r.nextInt(1000000));
	}
}
