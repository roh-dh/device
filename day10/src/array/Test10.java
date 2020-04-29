package array;

public class Test10 {
	public static void main(String[] args) {
//		배열의 위치를 가지고 할 수 있는 작업
//		 -배열에 ?번 위치랑 ?번 위치의 데이터를 바꿔라!
		
		int[] data = new int[] { 3, 5, 2 ,1 ,4};						//카드를 뽑아서 섞을때.


// 3과 1을 바꾼다(X) = data[0]과 data[3]을 바꾼다.(O)		위치를 바꾼다.		
//		잘못된 코드
		data[3] = data[0]; //data[3]에 data[0]의 값을 넣어라.
		data[0] = data[3]; //data[0]에 data[3]의 값을 넣어라.
		
//		정상적인 코드 : 임시 변수를 하나 만들어서 돌려서 대입
		
		int tmp = data[3];
		data[3] = data[0];
		data[0] = tmp;
		
		
//	출력
	for(int i=0; i < data.length; i++) {
		System.out.println(data[i]);
	}
	
	}
}
