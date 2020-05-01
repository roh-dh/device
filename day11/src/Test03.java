
public class Test03 {

	public static void main(String[] args) {

//		다음 성적 정보를 저장하고 문제를 푸세요

//		1반 : [50, 75, 90, 40, 80]
//		2반 : [66, 70, 55, 85, 70]
//		3반 : [60, 50, 80, 90, 95]
//		반 학생들의 성적을 있는 그대로 화면에 출력
//		각 반 학생들의 성적 평균을 구하여 화면에 출력
//		72점인 학생의 전체 석차를 예상하여 출력

		
//		각각의 반 평균을 구하여 
		
//      평균은 합계 / 개수
		
//		첫번째 반 합계
		int totlal1 =0;
		for(int i=0; i< 첫번째반.length; i++) {
			total1 +=첫번째반[i];
		}
		
//		두번째 반 합계
		int total2 =0;
		for(int i=0; i <두번째반.length; i++) {
			total2 += 두번째반[i];
		}
		
		}
		
		
//		int[][] score = new int[3][5];
		int[][] score = new int[][] { 
			{ 50, 75, 90, 40, 80 },  //  
			{ 66, 70, 55, 85, 70 }, 
			{ 60, 50, 80, 90, 95 } };
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]);
				System.out.print("\t");
			}
			System.out.println();			
		}
	}
}
