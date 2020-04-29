package array;
import java.lang.*;
import java.util.Random;
public class Test03 {
	public static void main(String[] args) {
//		배열 : 변수가 줄줄이 모여 있는 것
		
//		예제 : 주사위 3개를 던진 결과를 출력하는 프로그램을 구현
		Random r = new Random();
		
//		배열 생성 : 
//		- 여러개라고 생각하지만 실제로는 3개니까 3칸의 변수를 합쳐서 사용
		int[] d = new int[5000];
//		System.out.println(d);
		
		for(int i=0; i < 5000; i++) {
			d[i] = r.nextInt(6) + 1;
		}
		
		for(int i=0; i < 5000; i++) {
			System.out.println(d[i]);
		}
		
	}
}