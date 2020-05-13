package api.lang.string;

import java.util.*;

public class Test02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//1
		System.out.println("아이디와 비밀번호를 입력하세요.");
		System.out.print("ID : ");
		String a = sc.next();
		System.out.print("Password : ");
		String b = sc.next();
		
		if(a.equalsIgnoreCase("khacademy")&& b.equals("student")) {
			System.out.println("로그인에 성공했습니다.");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		} 
//2		
/*		System.out.println("아이디와 비밀번호를 입력하세요.");
		System.out.print("ID : ");
		String c = sc.next();
		System.out.print("Password : ");
		String d = sc.next();
		
		sc.close();
		if(c.equals("tester")&& d.equals("test1234")) {
			System.out.println("로그인에 성공했습니다.");
		} else if(c.equals("master")&& d.equals("master1234")){
			System.out.println("로그인에 성공했습니다.");
		} else if(c.equals("user")&& d.equals("user1234")) {
			System.out.println("로그인에 성공했습니다.");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다."); 
		} */



		
	}
}
