package sort;

public class BubbleSort {
	public static void main(String[] args) {

//		버블정렬
//		왼쪽부터 오름차순으로 정렬할건데,,
//		왼쪽 숫자와 오른쪽숫자를 처음부터 끝까지 비교해가면서 정렬..

		int i, j, tmp;

		int[] array = new int[] { 5, 4, 3, 2, 1 };

		for ( i = 0; i < array.length; i++) {
			for (j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				} 
			}
		}
	for(i=0; i<array.length;i++) {
		System.out.println(array[i]);
	}
	}
}