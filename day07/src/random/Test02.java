package random;
import java.lang.*;
import java.util.Random;
public class Test02 {

	public static void main(String[] args) {
//		Random 도구를 사용하여 랜덤값 추ㅜㄹ
		
//		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int a =r.nextInt();
		System.out.println(a);
		
		int b = r.nextInt(10/*개*/)+1/*부터*/;
		System.out.println(b);
		
		
		
	}
}
