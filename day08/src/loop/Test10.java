package loop;

public class Test10 {
	public static void main(String[] args) {
		int count = 0;
		int n =1;
		while (n< 100) {
			System.out.println("n= " +n);
			n++;
			if(n/10 ==5 || n%10 ==5) {			//(십의 자리가 5 또는 일의 자리가 5)
				count++;
			}
		}
System.out.println("5가 들어간 숫자의 개수 : "+ count);






	}
}
