package api.lang.string;

public class Test08 {
	public static void main(String[] args) {
//	문자열 변환(기본형)
		
		int a = 10;
//		String b = a;
//		String b = (String)a;
//		String b = ""+a; //편법
		String b = String.valueOf(a);   // int -> String 으로 변환
		System.out.println(b);
		
		String c= "123"; // 
		int d = Integer.parseInt(c);  // String-> int 변환
		System.out.println(d);
			
	}
}
