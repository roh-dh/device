package array;


public class Task01 {
	public static void main(String[] args) {

// 다음 데이터를 배열에 저장하고 주어진 문제에 맞게 위치를 조작하여 출력
		String[] data = new String[] {"자바", "파이썬", "자바스크립트", "루비", "C#"};

//		계산
		System.out.println(data.length);

//		역순으로		
		System.out.println("0번 위치와 4번 위치의 데이터를 교환");
		System.out.println("1번 위치와 3번 위치의 데이터를 교환");
		
//		출력
		System.out.println(data);
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		
		
		
	}
}
