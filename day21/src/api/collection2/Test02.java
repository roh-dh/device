package api.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {

// 다음은 어제와 오늘 내가 공부한 자바의 용어들입니다.

//	-어제 : String, 반복문, 조건문
// -오늘: 배열, 반복문		
		
		Set<String> a = new TreeSet<>();

// 어제 공부한 단원 추가
		a.add("String");
		a.add("반복문");
		a.add("조건문");
		
//	오늘 공부한 단원 추가
		a.add("배열문");
		a.add("반복문");
		
		System.out.println(a);
		
		
//		Set에서는 index접근은 불가하고 확장반복만 가능하다(전체 처리)
		for(String name : a) {
			System.out.println(name);
		}
	}
}
