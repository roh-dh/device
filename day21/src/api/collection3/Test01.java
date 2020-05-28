package api.collection3;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
//		map : key-value 저장소	
//		- key-value는 아이디-비밀번호의 관계와 같은 경우를 말한다.
//		- 예 :변수명-값 아이디-비밀번호
//  동기화O 잠금장치 O 느림 동기화X 잠금장치 X 빠름
//		-순서가 유지되지 않음(무시됨), k는 중복 불가, v는 중복 가능
		
		// 부하계수 (늘어나는 시점%) 프로그래밍에서의 비율 0.0~ 1.0 
//		Map<변수이름, 정수>  memory = new HashMap<>();
		Map<String, Integer> memory = new HashMap<>();
		
//		데이터 추가 : .add(e) 한개 -----> .put(k, v) 세트로 보관

		memory.put("a", 10); //10을 a란 이름으로 보관해라!
		memory.put("b", 20); //20을 b란 이름으로 보관해라!
		memory.put("c", 10); //10을 c란 이름으로 보관해라!
		memory.put("d", 10); //20을 d란 이름으로 보관해라!
		// 순서바꿔도 무시됨
		
//		데이터 개수 :. size()
		System.out.println(memory.size());
		System.out.println(memory);
		
//		데이터 검색 : .contains(e) ----> .containsKey(k) .containsValue(v) 두개로 나눠진다.
		System.out.println(memory.containsKey("a"));
		System.out.println(memory.containsValue(10));

// 	데이터 삭제 : .remove(e) ----> .remove(k) key만 삭제가능
		memory.remove("a");
		
		System.out.println(memory.size());
		System.out.println(memory);
		
		
	}
}
