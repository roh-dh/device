package api.collection;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
	public static void main(String[] args) {
//	List의 다른 명령들
		
	List<Integer> list = new ArrayList<>();
//	List<?> list = new ArrayList<>();
	
//	데이터 추가 : .add()
	list.add(3);	list.add(5);	list.add(2);	list.add(1);	list.add(4);

//	5가 들어 있나요? .contains()
	
	System.out.println(list.contains(5));
	
//	3을 지워보세요 또는  2번 위치에 있는 값을 지우세요. : .remove()
	list.remove(1); //위치
	
	
//	데이터 개수 확인 .size()
	System.out.println(list.size());
	
	System.out.println(list);
	
//	데이터 위치를통한 값 확인 : .get()
	System.out.println(list.get(0));
	System.out.println(list.get(1));
//	System.out.println(list.get(100)); //100번 위치의 값 내놔!(예외)
	
	
//	마지막 데이터
	System.out.println(list.get(list.size()-1));
	System.out.println(list);
	
	
	
	
	}
}
