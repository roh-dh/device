package api.io.file;

import java.io.File;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
//		자바에서는 파일을 만들거나 삭제할 수도 있다(폴더도 물론 가능)
//		- 운영체제에서 금지한 곳에는 접근할 수 없다
		
		File dir = new File("files");
		
		System.out.println(dir.exists());//있어요?
		
//		dir.mkdirs();//폴더 생성 명령
		
//		dir.delete();//폴더 삭제 명령
		
//		dir.createNewFile();//파일 생성 명령
		
		dir.delete();//파일 삭제 명령
	}
}
