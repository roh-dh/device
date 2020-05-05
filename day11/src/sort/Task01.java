package sort;

public class Task01 {
	public static void main(String[] args) {
/*
tmp = [1]
[1] = [0]
[0] = tmp;

tmp = [2]
[2] = [1]
[1] = [0]
[0] = tmp;
 */
		
		int[] data = new int[] { 10, 8, 2, 4, 6, 3, 7, 9 };

		for (int i = 1; i < data.length; i++) {

			int tmp = data[i]; // data[1]

			int n = i - 1; // data[1] 바로 좌측부터 비교. (i-1)
				while (n >= 0 && tmp < data[n]) { // 저장한값과 왼쪽값(data[n])을 비교
					data[n + 1] = data[n];
					n--;
			}
				data[n + 1] = tmp;
		}

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}
}
