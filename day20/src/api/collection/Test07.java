package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();

		while(true) {
			System.out.println("사자성어 입력");
			String k = sc.next();
			if(!list.contains(k) && k.length()==4) {
				list.add(k);
			}
			else {
				break;
			}
		}
		sc.close();
		System.out.println(list);
		
	
		
	}
}
