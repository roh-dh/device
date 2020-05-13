package api.lang.wrapper;

public class Test02 {
	public static void main(String[] args) {

// Integer 를 이용하여 Test01을 풀어보자.
		
//	63을 2진수로 변경
		String str = Integer.toBinaryString(63);
		System.out.println(str);
	
//	10 + 20 = ? (불편~~~)
	Integer a = new Integer(10);
	Integer b = new Integer(20);
	Integer c = Integer.sum(a, b);
	System.out.println(c.toString());
	}
}
