package api.collection;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
	public static void main(String[] args) {

//		List의 전체데이터 출력(처음부터 끝까지)
		List<String> list = new ArrayList<>();
		list.add("뽀로로");
		list.add("펭수");
		list.add("피카츄");
		list.add("미키마우스");
		list.add("슈퍼마리오");
		
		System.out.println(list);
		
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
//		확장 반복문 : 전체를 편하게 반복하는 반복문
		for(String name : list) {
			System.out.println(name);
		}
		
	}
}
