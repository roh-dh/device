package sort;

public class Exercise {
	public static void main(String[] args) {

		//3,5,2,4,1,4를 오름차순으로 정렬해라.
		int[] data = new int[] { 3, 5, 2, 1, 4 };

		int number = 0;
		for(int i=1; i<5; i++) {
// 첫번째 위치 (number)와 data[1]부터 5까지 비교해라
			if(data[number]>data[i]) {
				number = i;
					}
		}
		
	}
}
