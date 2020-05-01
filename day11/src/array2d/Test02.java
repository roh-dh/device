package array2d;

public class Test02 {
	public static void main(String[] args) {

//		Test01을 2차원 배열로 풀이		
//		int[] a = new int[] {50,60,70};
//		int[] b = new int[]  {75,65,70};

//		int[][] c = new int[줄][칸];
//		int[][] c = new int[2차원크기][1차원크기];

//		c   ------->   c[0] -------> [ 0 ][ 0 ][ 0 ]
//				         c[1] -------> [ 0 ][ 0 ][ 0 ]

//		int[][] c = new int[2][3];
		int[][] c = new int[][] { { 50, 60, 70 }, { 75, 65, 70 } };

//    출력

		/*
		 * for(int i=0; i<c[0].length; i++) { System.out.println(c[0][i]); } for(int
		 * i=0; i<c[1].length; i++) { System.out.println(c[1][i]); }
		 */
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}

	}
}
