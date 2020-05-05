package array2d;

public class Test03 {

	public static void main(String[] args) {
//		다음 성적 정보를 저장하고 문제를 푸세요

//		1반 : [50, 75, 90, 40, 80]
//		2반 : [66, 70, 55, 85, 70]
//		3반 : [60, 50, 80, 90, 95]
//		반 학생들의 성적을 있는 그대로 화면에 출력
//		각 반 학생들의 성적 평균을 구하여 화면에 출력
//		72점인 학생의 전체 석차를 예상하여 출력


int[][] score = new int[][] {
	{50, 75, 90, 40, 80},
	{66, 70, 55, 85, 70},
	{60, 50, 80, 90, 95}
};

int[] total = new int[3];
double[] avg = new double[3];

for(int i=0; i<score.length; i++) {
	for(int k=0; k<score[i].length; k++) {
		total[i] += score[i][k];
	}
	System.out.println((i+1)+"반 총점 : "+total[i]);
	avg[i] = (double)total[i]/score[i].length;
	System.out.println((i+1)+"반 평균 : "+avg[i]);
}

int myscore = 72;		
int rank = 1; //나보다 시험 잘본 사람 수+1

for(int i=0; i<score.length; i++) {
	for(int k=0; k<score[i].length; k++) {
		if(score[i][k]>72) {
			rank++;
		}

	}
}
System.out.println(rank+"등");


for(int i=0; i<score.length; i++) {
	for(int k=0; k<score[i].length; k++) {
		System.out.print(score[i][k]);
		System.out.print("\t");
	}
	System.out.println();
}


		
	}
}