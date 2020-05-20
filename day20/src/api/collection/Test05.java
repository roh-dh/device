package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test05 {
	public static void main(String[] args) {

		Random r = new Random();
		// 로또번호

		List<Integer> list = new ArrayList();

/*		for(int i =0; i <6; i++) {
			int n = r.nextInt(45) + 1;			
			if(!list.contains(n)) {
				list.add(n);
			}
			else {
				i--;
			}
		}

		System.out.println(list); */

		
//		while(6개가 뽑히지 않았다면) {		
		while(list.size()<6) {
			int n =r.nextInt(45)+1;
			if(!list.contains(n)) {
				list.add(n);
			}
		}
		System.out.println(list);
	}
}
