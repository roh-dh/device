package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
//	프로젝트에 만들어둔 single.txt를 copy.txt라는 파일에 복사
//	두 파일은 동일한 내용을 가져야 함
//	프로그램이 실행되면 자동으로 복사가 완료되도록 구현	

		File readFile = new File("single.txt");
		FileInputStream in = new FileInputStream(readFile);
		
		File writeFile = new File("copy.txt");
		FileOutputStream out = new FileOutputStream(writeFile);
		
//		[single.txt] --> readFile --> in --> [프로그램] --> out --> writeFile --> [copy.txt]
		
//		글자전체 복사(while)
		while(true) {
			int n =in.read();
			if(n ==-1)break;
			out.write(n);
		}
		
//		끝나면 정리정돈!
		in.close();
		out.close();
	}
}
