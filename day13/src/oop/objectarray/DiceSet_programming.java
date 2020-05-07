package oop.objectarray;

public class DiceSet_programming {

	public static void main(String[] args) {
//	주사위를 2번씩 10세트 던진 결과를 저장 및 출력
//	[1] 2차원 배열 - 10줄 2칸		
//	[2] 객체 배열 - 세트 객체 10개 - 1차원
//	(주의) 객체 배열을 만든다고 개체가 생기는 것은 아니다.
		DiceSet[] data = new DiceSet[10];  //(주의) 객체 배열을 만든다고 개체가 생기는 것은 아니다.
		

		for(int i=0; i<10; i++) {
			data[i] = new DiceSet(); 
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]); //리모콘
			data[i].output(); //리모콘안에 뭐가들어가 있나?
		}
	}

}
