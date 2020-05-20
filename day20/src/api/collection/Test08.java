package api.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test08 {
	public static void main(String[] args) {
//		 list "순서"를 중요시 여기기 때문에 순서와 관련된 명령이 많다.
//		 - 순서대로 정렬
//		 - 순서를 뒤집어라
//		 - 순서를 뒤섞어라
		
		List<Integer> n = new LinkedList<>();

		for(int i =1; i <=10; i++) {			
			n.add(i);
		}
		System.out.println(n);
		
		System.out.println("리버스!");
		Collections.reverse(n);
		System.out.println(n);

		System.out.println("셔플!");
		Collections.shuffle(n);
		System.out.println(n);
		
		System.out.println("정렬!");
		Collections.sort(n);
		System.out.println(n);
		
		
	}
}
