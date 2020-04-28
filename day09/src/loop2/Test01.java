package loop2;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
// do~while문(do문)
// (do를 먼저하고 while을 반복해라.)
// -선 실행, 후 검사를 수행하는 구문
// -구문 양식이 어려워서 최근 잘 안쓰는 추세
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		do {
			
		System.out.println("시험 성적 입력");
		score = sc.nextInt();

		}
//		while(실행조건);
//		while(score <0 || score>100); // 점수가 이상하면
		while(!(score >= 0 && score <=100)); //점수가 정상이 아니면
		
		
		sc.close();
	}
}
