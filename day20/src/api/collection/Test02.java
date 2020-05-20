package api.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Test02 {
	public static void main(String[] args) {
//	List : 순서가 존재하는 저장소(하위 클래스 중 아무거나 생성하면 됨)
//	List a = new ArrayList(); //배열의 형태를 띈 List
	List<String> a =new ArrayList<String>();
	List<Integer> b =new ArrayList<Integer>();
	List<Boolean> c =new ArrayList<Boolean>();
	List d = new CopyOnWriteArrayList(); //Blocking ArrayList(동기화)
	List e = new LinkedList<>(); //연결 형태의 List
	
	
//	추가 :add()
//	a.add(100);
//	a.add(true);
//	a.add(1.5);
//	a.add(100);
//	a.add(10);
//	a.add("hello");
	
	System.out.println(a);
	
	}
}
