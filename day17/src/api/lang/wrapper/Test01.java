package api.lang.wrapper;

public class Test01 {
	public static void main(String[] args) {
// 원시형 데이터의 한계

		
//		10+20 = ?
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);

//		155를 16진수로 바꿔서 출력해보세요. (불편~~~)
		int d= 62;
		String str = "";
		for(int i=d; i>0; i/=2) {
//			System.out.print(i%2);
			str = i%2 +str;
		}
		System.out.println(str);
		
		
		
	}
}
