package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day200 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> saja = new ArrayList<>();

		while(true) {
			System.out.println("사자성어를 입력해.");
			String input = sc.next();
			if(input.length()==4&& !saja.contains(input)) {
				saja.add(input);
			} else {
				System.out.println("GAME OVER");break;
			}
			
//			만약에 사자성어의 글자수가 네개이고 사자성어가 입력한값을 포함하지 않으면(반복하지 않으면)	
		}
sc.close();
System.out.println(saja);
	}
}
