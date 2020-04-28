package loop2;

public class Test02 {
	public static void main(String[] args) {
//		목표는 1부터 10까지를 화면에 출력하는 것

//		1. while문을 이용한 구현		
		int a = 1;  //선언부(반복에 필요한 숫자를 선언하고 초기화 하는 부분)
		while(a <= 10) {  //조건부(반복을 수행하기 위해 필요한 조건을 검사)
			System.out.println("a = " + a);
			a++; //증감부(반복수를 증가 또는 감소시키는 부분)
		}

//		2. for문을 이용한 구현.
//		for(선언부; 조건부; 증감부)[코드]
		
		for(int i=1; i<=10; i++) { 
			System.out.println("i = " + i);
		}
		
	}
}
