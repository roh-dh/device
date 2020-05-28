package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) throws IOException {
		//버퍼 이용해서 여러개를 한 번에 출력
		// - 준비물 : 출력용 파일객체 , 출력용 스트림, 버퍼(크기 :5)
		
		File target = new File("test.txt");
		FileOutputStream out = new FileOutputStream(target);
	
		byte[] buffer = new byte[] {104, 101, 108, 108, 111}; //hello
		
//		out을 이용하여 buffer에 들어있는 데이터를 원하는만큼 출력
		out.write(buffer); //out에다가 buffer의 데이터를 다 집어넣어라!
		out.write(buffer, 0, 4); //out에다가 buffer의 데이터 중 0번부터 4
	}
}
