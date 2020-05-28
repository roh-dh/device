package api.collection2;

import java.util.HashSet;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
// HashSet - 해시 알고리즘을 사용하는 Swet 저장소
		Set<Integer> s = new HashSet<>();
		
		s.add(300);
		s.add(100);
		s.add(200);
		s.add(500);
		s.add(400);
		
		System.out.println(s);
		
// 전체 명령은 동일하지만 구조가 다르다는 것을 유의할 것!
		
	}
}
