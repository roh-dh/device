package array2d;

public class Test01 {
	public static void main(String[] args) {
//		1차원 배열을 이용하여 2개 반의 학생 점수를 보관 및 출력
//		- 각 반에는 학생이 3명씩 있다고 가정
//		-변수로 풀면 변수 6개가 필요함(인원수대로) - 차원x
		
//		-1차원 배열로 풀면 배열 ?개가 필요함(반 개수대로) - 1차원
//		-2차원 배열로 풀면 배열 1개가 필요함.
		
		
//		int[] a = new int [3];
		int[] a = new int[] {50,60,70};
		int[] b = new int[]  {75,65,70};
		
//		출력 - 반마다 따로 받는통장표시
		for(int i=0; i < a.length; i++) {
			System.out.println("A반 점수 : "+a[i]);
		}
		for(int i=0; i<b.length; i++) {
			System.out.println("B반 점수 : "+b[i]);
		}
	}
}
