package array2d;

import java.util.Random;

public class Test04_4 {
	public static void main(String[] args) {
		int size = 5;
		int[][] bingo = new int[size][size];

//		bingo.length= size
//		bingo.length[i]= size

		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}

//	랜덤한 위치를 설정하여 1을 대입
		Random r = new Random();
		for (int i = 1; i <= size * size; i++) {
			int x = r.nextInt(size);
			int y = r.nextInt(size);
			if (bingo[x][y] == 0) {
				bingo[x][y] = i;
			}
			else {
				i--;
			}
		}

	}
}
