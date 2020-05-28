package api.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
// set<E>: 순서가 정해져 있는 저장소(순서가 무시되는 저장소)
// - ex : 전화번호부는 어떤 순서로 등록하던 가나다순으로 저장
// -전체를 빠르게 조회하고 싶을 때 사용하는 비선형구조(넣을 때 에너를 많이 소모!)
// -index가 없기 때문에 관련 명령이 존재하지 않음(get())
// -index가 없기 때문에 중복이 불가능하다.	
		
		
		Set<Integer> s = new TreeSet<>(); //s라는 저장소는 Tree 방식을 사용하는 Set 저장소이다
//		Set<Integer> s = new HashSet()://s라는 저장소는 Hash 방식을 사용하는 set 저장소이다.
		
			
//		추가 : add()
			s.add(3);
			s.add(5);
			s.add(1);
			s.add(2);
			s.add(4);
			
// 개수확인 : size()
			System.out.println(s.size());

// 5가 저장소에 있나요? : contains()
			System.out.println(s.contains(6));

// 3을 지우세요	: remove()
			System.out.println(s.remove(3));
			
			System.out.println(s);
			
	}
}
