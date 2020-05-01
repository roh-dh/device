package sort;

public class Test01_2 {
	public static void main(String[] args) {
		
		int[] data = new int[] {3,5,2,1,4}; //배열을 만든다.
	for(int k=0; k<=3; k++) {
		int number = k; //0번이 제일작다고 치자.
		for(int i=number +1 ; i< data.length; i++) {
			if(data[number] >data[i]) {
				number =i; //넘버를 i로 변경하세요.
			}
		}
		
//		number의 데이터를 앞으로 이동
		int tmp = data[k];
		data[k] = data[number];
		data[number] = tmp;
	}
		int number = 0; //0번이 제일작다고 치자.
		for(int i=number +1 ; i< data.length; i++) {
			if(data[number] >data[i]) {
				number =i; //넘버를 i로 변경하세요.
			}
		}
		
//		number의 데이터를 앞으로 이동
		int tmp = data[0];
		data[0] = data[number];
		data[number] = tmp;

		//		출력
		for(int i=0; i< data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
}
