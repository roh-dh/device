package sort;

public class Test03_1 {
	public static void main(String[] args) {

		
//		데이터 준비.
		int[] data = new int[] {6,5,3,1,8,7,2,4};
//		계산(정렬)  
		for(int i=0; i<data.length; i++) {
			
		
		int index =i; //정렬할 위치
		int backup = data[index];
		
		while(index>0 && data[index-1] > backup) {
//			index는 한칸 앞으로 데이터는 한 칸 뒤로
			data[index] = data[index-1];
			index--;	
		}
		}
//		System.out.println("index = "+ index);
//		System.out.println("backup = " + backup);
		
		
		data[index] = backup; // 삽입 코드 (계산된 위치에 백업데이터 삽입
//		출력
		for(int i=0 ; i<data.length; i++) {
			System.out.print(data[i]+ " ");	
		}
		System.out.println();
	}
}
