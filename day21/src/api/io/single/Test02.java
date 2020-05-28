package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException, InterruptedException {
//		single byte 입력(single.txt의 내용을 불러와서 화면에 출력)
//		- 준비물 : 파일 객체 , 입력 통로
		
		File target = new File("single.txt");
		
//		불러오기 이므로 파일이 없으면 절대 안된다
		FileInputStream in = new FileInputStream(target);
//		[프로그램] <----- in <- target <----- 실제 파일
		
//		in이라는 통로에게 명령을 내려서 데이터를 읽어오도록 지시해야 한다
		while(true) {
			int n = in.read();
			if(n == -1) break;//EOF 처리(-1은 파일 끝을 의미)			
			System.out.println("n = " + n);
		}
		
//		다했으면 통로는 close 하도록 하자!
		in.close();
	}
}
