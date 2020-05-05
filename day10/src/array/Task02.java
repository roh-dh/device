package array;

import java.util.Random;

public class Task02 {
	public static void main(String[] args) {
		
//		다음 데이터를 배열에 저장하고 주어진 문제에 맞게 위치를 조작하여 출력

//		자바, 자바스크립트, 파이썬, 루비, C#
//		데이터의 순서를 무작위로 바꾸어 출력

//		모든 자리가 자기자신을 제외한 다른 자리와 한번 이상 바뀌어야 합니다


/*데이터 갯수	각각한번씩	반대쪽		반복횟수
1						0
2		data[0]		data[1]		2
		data[1]		data[0]	

3		data[0]		data[?]		3	
		data[1]		data[?]
		data[2]		data[?]

4		data[0]		data[?]		4	
		data[1]		data[?]
		data[2]		data[?]
...		...		...		...
i		data[i]		data[?]		data.length		*/
		
		
		
		String[] data = new String[] { "자바", "자바스크립트", "파이썬", "루비", "C#" };
		Random r = new Random();
		for (int i = 0; i < data.length; i++) {
			int language = r.nextInt(data.length);

			while (i == language) {
				language = r.nextInt(data.length);
			}
			String tmp = data[i];
			data[i] = data[language];
			data[language] = tmp;

		}

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}
}
