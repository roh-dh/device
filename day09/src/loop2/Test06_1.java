package loop2;

public class Test06_1 {
	public static void main(String[] args) {
//		3,6,9 시뮬레이션

//		어떤 숫자가 주어졌을 때 이숫자의 10의 자리와 1의 자리를 검사

for(int k = 1; k<100; k++) {
	// -어떤 숫자가 들어오던 간에 매 자리를 검사하돌고 구현
	int n = k;

	/*		System.out.println(n % 10); // 1의 자리 추첨.
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	n = n / 10; // 1의 자리를 버림
	System.out.println(n % 10);
	 */		
	

	
	int count =0;
	for(int i=n; i >0; i /= 10) {
		System.out.println(n % 10); // 1의 자리 추첨.
		if(i %10 ==3 || i%10 ==6 || i%10 ==9 ) {
			count++;
		}
		
	}
	
	if(count ==0) { //3,6,9가 없으면
		System.out.println(n);
	} else { //3,6,9가 있으면 = count번 박수를 친다(for)
		for(int i=0; i< count; i++) {
			System.out.println("짝");
		}
		System.out.println(); //엔터
		}
}
		
		}
		

}
