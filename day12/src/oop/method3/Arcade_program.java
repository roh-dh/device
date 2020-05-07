package oop.method3;

public class Arcade_program {
public static void main(String[] args) {
	
	Arcade a1 = new Arcade();
	Arcade a2 = new Arcade();
	Arcade a3 = new Arcade();
	

	
	
	a1.setting("스노우맨", 300);
	a2.setting("보글보글", 500);
	a3.setting("철권", 1000);
	
// 아직 수입이 없는 새 게임기	
/*	a1.output();
	a2.output();
	a3.output();*/

	
	
	/*
//	1. 철권 10판
	a3.income += 1000 *15;
	a3.income += a3.price*15;

	
//	2. 보글보글 12판	
	a2.income +=a2.price*12;
	
//	3. 스노우맨 30판	
	a1.income +=a1.price*30;
	*/	
	
	a1.play();
	a2.play();
	a3.play();

//	30판, 12판, 10판 한 게임기의 누적수입
	
	a1.output();
	a2.output();
	a3.output();
	

	
}

	
}
