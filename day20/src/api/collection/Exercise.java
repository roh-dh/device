package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise {
	public static void main(String[] args) {

//		List형태의 저장소를 만들어서 로또번호 6개를 저장한 뒤 출력

//		(로또번호는 1부터 45 사이의 정수 중 한 개를 추첨합니다)

		Random r = new Random();
		List<Integer> list = new ArrayList();
		
		for(int i=0; i<6; i++) {
			int a = r.nextInt(45)+1;
			if(!list.contains(a)) {
				list.add(a);
			} else {
				i--;
			}
			
		}
		System.out.println(list);
		

	}
}
