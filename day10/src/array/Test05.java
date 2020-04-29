package array;

public class Test05 {
	public static void main(String[] args) {
		
//		1. 10, 20, 30			
//		-> 정수 3개 -> 정수 배열(3칸짜리)을 1개 생성

		int[] a = new int[3];
//		int[] a = new int[] {10,20,30};
//		a -------------------- [0] [0] [0]
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		for(int i=0; i<3; i++) {
			System.out.println(a[i]);
		}

		
//		2. 사과, 딸기, 바나나		
		String[] b = new String[3];

//		b ----------------- [null] [null] [null]		
		
		b[0] = "사과";
		b[1] = "딸기";
		b[2] = "바나나";
		
		for(int i=0; i<3; i++) {
		System.out.println(b[i]);	
		}
				
		
		
//		3. 1.2f, 2.3f, 3.4f
		float[] c = new float[3];
		
		c[0] = 1.2f;
		c[1] = 2.3f;
		c[2] = 3.4f;
		
		for(int i=0; i<3; i++) {
			System.out.println(c[i]);
		}
		
	}
}
