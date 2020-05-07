package oop.method1;

public class Menu2 {

	public static void main(String[] args) {
			
				
											
		
		Menu m1 = new Menu();
		Menu m2 = new Menu();
		Menu m3 = new Menu();
		Menu m4 = new Menu();
		
		m1.setting("아메리카노", "음료", 1800, true);
		m2.setting("프라푸치노", "음료", 3500, false);
		m3.setting("파니니", "음료", 2300, true);
		m4.setting("크로크무슈", "음료", 3300, false);
		
		

// 출력		
//		a을 주인공으로 하여 output()의 코드를 실행
		m1.output();
		m2.output();
		m3.output();
		m4.output();
		
// 왜 네줄씩 다 써야됨?		
		
	}

}
