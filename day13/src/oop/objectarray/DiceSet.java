package oop.objectarray;

import java.util.*;

//주사위 한세트
public class DiceSet {
	int first,second;
	
//	옵션1:랜덤 생성하는 방법
	DiceSet(){//기본 생성자: 매개변수가 하나도 없는 생성자
		Random r = new Random();
		this.first = r.nextInt(6)+1;		
		this.second = r.nextInt(6)+1;
	}
	
//	옵션2: 값을 집어넣어서 생성하는 방법
	DiceSet(int first, int second){
		this.first = first;
		this.second = second;
	}
	
	void output() {
		System.out.println("첫번째 : "+this.first+" , 두번째 : "+this.second);
	}
}
