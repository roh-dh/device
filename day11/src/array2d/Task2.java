package array2d;

import java.util.Random;

public class Task2 {
	public static void main(String[] args) {

		int[][] bingoBorad = new int[5][5];
		Random r = new Random();
		int num = 1;

		for (int i = 0; i < bingoBorad.length; i++) {
			for (int k = 0; i < bingoBorad[i].length; k++) {
				bingoBorad[i][k] = num++; // 0102030405........5152535455
				System.out.println("빙고판 : " + bingoBorad[i][k]); // 범위오류?
			}

			for (int i = 0; i < bingoBorad.length; i++) {
				for (int k = 0; i < bingoBorad[i].length; k++) {
					int bingoRandom = r.nextInt(25) + 1;
					
					
				}
			}
		}

	}
}
