package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
//		2. 1번에서 만든 저장소를 이용하여 로그인 프로그램을 구현
		
//		1.Map을 만들어 (아이디, 비밀번호)를 저장
		Map<String, String> db= new HashMap<>();
		db.put("test", "test1234");
		db.put("admin", "admin1234");
		db.put("master", "master1234");
		
	
		System.out.println(db);
		System.out.println(db.size());
		
// 	2번
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디, 비밀번호 입력");
		String id = sc.nextLine();
		String password = sc.nextLine();
		sc.close();
		
		if(db.containsKey(id) && db.get(id).equals(password)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}

}
