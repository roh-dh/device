package api.io.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		single byte 출력
//		- 준비물 : 파일 객체, 출력 스트림
		
		File target = new File("single.txt");
		
//		현재 target은 없지만 존재하지 않아도 저장하면 자동 생성됨(직접 생성하지 않아도 됨)
//		if(!target.exists()) {//파일이 없으면
//			target.createNewFile();//target을 생성해라
//		}
		
		FileOutputStream out = new FileOutputStream(target);
//		프로그램 -> out -> target -> 실제파일
		
//		out에게 데이터를 전달하면 자동으로 파일까지 전달된다.
		out.write(65);//연결된 통로를 통해 target에 65를 전달해라! A
		out.write(66);//연결된 통로를 통해 target에 66을 전달해라! B
		out.write(9);//\t
		out.write(104);//h
		out.write(101);//e
		out.write(108);//l
		out.write(108);//l
		out.write(111);//o
		out.write(10);//\n
		
//		30000을 넣었지만 실제로 48로 변해서 전달(byte 초과 안됨)
		out.write(30000);
		
//		다했으면 사용한 통로를 close 처리
		out.close();
	}
}
