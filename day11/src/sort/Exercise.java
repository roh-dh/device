package sort;

import javax.xml.crypto.Data;

public class Exercise {
	public static void main(String[] args) {

//	 오른쪽숫자와 계속비교해가면서 크면 자리바꿈

		int[] data = new int[] { 3, 5, 2, 1, 4 };

		int i, j, tmp;

		for(i=0;i<data.length-1; i++) {
			j = i;
					while(j>=0 && data[j]>data[j+1]) {
						tmp = data[j];
						data[j] = data[j+1];
						data[j+1] = tmp;
						j--;								
					}
		}
		for(i =0 ; i<data.length; i++) {
			System.out.println(data[i]);
		}
			
	}
}
