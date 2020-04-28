package loop2;

public class Test06 {
	public static void main(String[] args) {
//		3,6,9 시뮬레이션

//		어떤 숫자가 주어졌을 때 이숫자의 10의 자리와 1의 자리를 검사
for(int n=1; n<=99; n++ ) {


		int a = n / 10;
		int b = n % 10;

		int count = 0;
		
		//10의 자리와 1의 자리를 "각각" 검사
		if (a == 3 || a == 6 || a == 9) {
			count++;
		}
		if (b == 3 || b == 6 || b == 9) {
			count++;
		}
		switch(count) {
			case 0: System.out.println(n); break; // 3,6,9가 없으면 숫자 출력
			case 1: System.out.println("짝"); break; //1개 있으면 박수 학번
			case 2 : System.out.println("짝짝"); break;	//2개 있으면 박수 두번
		}

}		
		
	}

}
