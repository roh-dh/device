package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test4_1 {
	public static void main(String[] args) throws IOException {
   // 한번에 여러개 내보내고 불러오기

	// 단위크기(버퍼크기)	
	// 준비물 : 입력파일객체, 입력스트림, 4개 저장소
		
		File target = new File("single.txt");
		FileInputStream in = new FileInputStream(target);
		//  [프로그램] <-- in <-- target <------ [single.txt]
		
		byte[] buffer = new byte[4];
		
//		buffer에 저장할 수 있도록 데이터를 불러올 계획
		
		// buffer에 저장할 수 있도록 데이터를 불러올 계획		
		while(true) {
			int n= in.read(buffer);
			if(n == -1) break;
			System.out.println(Arrays.toString(buffer));
			System.out.println(n);
		}
		
	}
}
