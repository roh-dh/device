package api.lang.string;

public class Test01 {
	public static void main(String[] args) {
		String a = "hello"; //기존에 쓰던 방식(new가 없어서 heap 메모리를 못
		String b = new String("hello");
		
//		a와 b는 같습니까?
		
	System.out.println(a==b);   // "리모콘이 같아요?" 
	System.out.println(a.equals(b));	// "내용이 같아요?"

	String c = "Hello";
	System.out.println(b.equals(c)); //"내용과 대소문자가 같아요?"
	System.out.println(b.equalsIgnoreCase(c)); // 대소문자 무시
	
	}
}
