package sort;

public class SelectionSort {

	public static void main(String[] args) {

//		selection sort

		int[] data = new int[] { 3, 5, 2, 1, 4 };

		int i, j, tmp;
		for (j = 0; j < data.length - 1; j++) {

			int min = j;
			for (i = 1 + min; i < data.length; i++) {
				if (data[min] > data[i]) {
					min = i;
				}
			}
				tmp = data[j];
				data[j] = data[min];
				data[min] = tmp;
			
			}
		for(i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}

	}
}
