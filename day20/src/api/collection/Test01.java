package api.collection;


import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {

// Set vs List
// set은 전화번호부처럼 특정 방식에 의해 분류되는 저장소
// list는 통화목록처럼 순서가 중요한 저장소...
		Set a = new TreeSet();
		List b = new ArrayList();

		a.add("조인성");	b.add("조인성");
		
		a.add("한효주");	b.add("한효주");
		
		a.add("아이유");	b.add("아이유");
		
		a.add("공유"); b.add("공유");
		
		a.add("수지"); b.add("수지");
		a.add("수지"); b.add("수지");
		a.add("수지"); b.add("수지");
		
		System.out.println(a);
		System.out.println(b);

	}
}
