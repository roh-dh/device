package api.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	public static void main(String[] args) {
// 데이터를 한 개씩 추가하는게 아니라 여러개를 추가할 수도 있을까?
		

	Set<String> yesterday = new TreeSet<>();
	Set<String> today = new TreeSet<>();
	
	yesterday.add("String");
	yesterday.add("반복문");
	yesterday.add("조건문");
	
	today.add("배열");
	today.add("반복문");
	
//	합집합(union)
	Set<String> total = new TreeSet<>();
	total.addAll(yesterday); //어제 공부한 단원 목록을 추가해라.
	total.addAll(today); //오늘 공부한 단원 목록을 추가해라.
	
	System.out.println(total);

	}
}
