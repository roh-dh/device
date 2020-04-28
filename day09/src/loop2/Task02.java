package loop2;

public class Task02 {
	public static void main(String[] args) {
		System.out.println("1부터 1000까지 (소수/합성수/1을 판정)");
		for (int j = 1; j <= 1000; j++) {

			int a = j;
			int count = 0;

			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					count++;
				}
			}
//		System.out.println("나머지가 0이 된 갯수 " + count);
			String str;
			if (count == 2) {
				str = (j + " : 소수");
			} else if (count == 1) {
				str = (j + " : 1");
			} else {
				str = (j + " : 합성수");
			}
			System.out.println(str);
		}
	}
}
