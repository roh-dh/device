package input;

import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		표준 입력 통로(System.in)를 이용하여 한글자씩 입력받기
		
		int a = System.in.read();
		
		System.out.println(a);
	}

}
