package array2d;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {

//	빙고 푸는 방법
//	1. 1차원배열로 만든 뒤 2차원배열에 복사
//	2. 2차원배열에 배치한 뒤 셔플 또는 위치 순서대로 랜덤값 배치	
// 	3. 1부터 순서대로 랜덤한 위치에 배치(실제와 가장 유사한 방식)

		int[] data = new int[25];
		
		Random r = new Random();
		
//		(1) 처음부터 랜덤데이터를 추가	*로또 복원 추출
		for(int i =0; i<data.length; i++) {
			data[i] = r.nextInt(data.length) +1;
			//내 앞의 모든 값과 비교해서 하나라도 같으면 재추첨(현재턴 무효(i--))
			for(int j=0; j<i ; j++) {
				if(data[i] ==data[j]) {
					i--;
					break;
				}
			}
		}
		for(int i =0; i<data.length; i++) {
			System.out.println(data[i]);
		}

		
		
//		(2) 순서대로 넣어놓고 셔플
	}
}
