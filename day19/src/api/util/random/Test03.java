package api.util.random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {

		long time = System.currentTimeMillis();
		System.out.println(time/2000);
		
//		Random r= new Random(?); 
		Random r = new Random();
		r.setSeed(time +id1.hashcode());
		System.out.println(id1 +" : "+ r.nextInt(1000000));
		
		r.setSeed(time +id2.hashcode());
		
		System.out.println(id2 +" : "+ r.nextInt(1000000));
		
		
		
		
	}
}
