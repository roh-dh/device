package sort;

public class Test02 {
	public static void main(String[] args) {
		int[] data = new int[] { 6, 5, 3, 1, 8, 7, 2, 4 };

//		data[0]을 data[1]와 비교 후 data[0]이 data[1]보다 더 크다면 뒤로 민다.
//		data[0]이 가장작다고 생각하고?

		for (int i = 0; i < 7; i++) {
			System.out.println("[" + i + "] vs [" + (i + 1) + "]비교");
		}
		System.out.println("2번째");
		for (int i = 0; i < 6; i++) {
			System.out.println("[" + i + "] vs [" + (i + 1) + "] 비교");
		}
		System.out.println("3번째");
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + i + "] vs [" + (i + 1) + "] 비교");
		}
	}
}
