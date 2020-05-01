package sort;

public class Test01_1 {
	public static void main(String[] args) {
//		배열의 정렬(sort)
//		-데이터를 원하는 순서대로 변경하는 것
//		-원하는 방식에 따라 오름차순(ascending), 내림차순(descending)으로 구분
//		-방식이 여러가지가 있음(청소와 비슷..)	

		int[] data = new int[] { 3, 5, 2, 1, 4 };

// 		최소값이 들어있는 위치를 찾는 코드		

		System.out.println("최소값이 들어있는 위치는 ?");

//		계산		
		int number = 0; // 0이 제일 작은 값이 들어있는 위치라고 가정

//		1번부터 4번까지 반복하며 number의 위치와 비교
		for (int i = number + 1; i<data.length; i++) {
			System.out.println(number + "위치와 " + i + "번 위치의 값을 비교");
			
/*			if(내 생각보다 작은 값이 등장하면) {
				내생각을 바꿉니다.
			} else {내 생각이 맞았다면)
				아무것도 하지 않는다.
			} */
			
			if(data[number]
					
					> data[i]) { //더 작은 값이 나오면
				number = i;
			}
			
			/*
			 System.out.println(number+"위치와 1번 위치의 값을 비교");
			 System.out.println(number+"위치와 2번 위치의 값을 비교");
			 System.out.println(number+"위치와 3번 위치의 값을 비교");
			 System.out.println(number+"위치와 4번 위치의 값을 비교");
			 */
			
			
			System.out.println(data[number] + "vs" + data[i]);
		}

		for (int i = 0; i < data.length - 1; i++) {
			System.out.println(i + "번부터 " + (data.length - 1) + "번까지 찾아요");
		}

	}
}
