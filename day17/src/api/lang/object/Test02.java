package api.lang.object;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

//		Q: 정말 Object는 모든 클래스의 아버지인가?

	Object a = 100;     //int --> Object
	Object b = "hello"; //String -> Object
	Object c = 1.5;
	Object d = true;
	Object e = new int[5];
	Object f = new Scanner(System.in);
	Object g = new Random();
	
//	b의 자료형은? 보관형태: Object 실제형태 : String
	System.out.println(b.getClass());	//getClass = 클래스정보를 가져와라. 자료형을 가져온다.  
	System.out.println(c.getClass());	
	System.out.println(f.getClass());	
	
//	Double h = 100.5;
	
	
	}
}
