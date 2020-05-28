package api.io.file;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
//		File I/O : file을 입출력하는 것
//		파일(file)
		
//  글자를 보관할 수 있는 저장 단위		
// 1. 텍스트 파일
//		- 글자 자체를 저장하는것이 의미가 있는 파일
//		-.txt .properties .dat .ini
		
// 2. 바이너리 파일
//		-글자를 해석하여 원하는 형태를 보여줄 때 의미가 있는 파일
//		-전용 프로그램이 필요한 파일
//		-mp3 .avi .xlsx .pptx
		
//		자바에서는 파일을 분석할 때에는 1, 2번을 구분하지 않는다.
		
//		자바에서 중요한 건 파일이나 폴더(디렉터리)나 하는 것
		
//		폴더(디렉터리)
//		파일을 보관할 수 있는 묶음 단위(크기가 없음)

		File a = new File("Hello.txt");
		
		
//		이름을 잘못 써도 만들어지기 때문에 "있나 없나"가 매우 중요함
		System.out.println("a가 존재합니까?");
		System.out.println(a.exists());
		
//		자바는 파일과 폴더를 구분하지 않고 모두 File 클래스로 관리합니다.
//		파일일 때와 폴더일 때를 구분하여 사용하는 명령 필요
		System.out.println("a가 파일입니까?");
		System.out.println(a.isFile());  //a가 파일입니까?
		System.out.println("a가 디렉토리입니까?");
		System.out.println(a.isDirectory()); //a가 디렉토리 입니까?
		
//		본격적인 파일 정보를 탐색
//		- 정보를 가져와야 하므로.getter 메소드를 이용
		System.out.println("파일이름 불러오기");
		System.out.println(a.getName()); //파일 이름
		System.out.println("절대경로");
		System.out.println(a.getAbsolutePath()); //절대경로
		System.out.println("상대경로");
		System.out.println(a.getPath()); //상대경로
		
//		파일의 크기 == 파일에 들어있는 글자의 크기
		System.out.println("파일 크기");
		System.out.println(a.length()); //파일의 크기(byte) : long으로 표현됨.
		
//		최종 수정 시간은 쓸 데가 많다
		System.out.println("최종 수정시간");
		System.out.println(a.lastModified()); //최종 수정 시각(ms) System.currentTimeMillis() 이랑 같은모양
	
//		 그외 에도 숨김인지, 읽기전용인지, 실행가능한지 등을 모두 확인할 수 있음
//		- 탐색기에서 되는건 다 된다고 보면 된다.
		System.out.println("숨김파일 인가?");
		System.out.println(a.isHidden()); //숨김파일인가?
		
	}
}
