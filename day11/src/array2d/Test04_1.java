package array2d;

import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {

		int[] data = new int[25];

		Random r = new Random();

		int number = 1;
		for (int i = 0; i < data.length; i++) {
			data[i] = number;
			number++;
		}

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
}
}

