package loop2;

public class Task02 {
	public static void main(String[] args) {
//		만약에 1과 n을 제외한 수중에서 나머지가 0이면 더이상 보지 말아라.	
		System.out.println("1부터 1000까지 (소수/합성수/1을 판정)");
		for (int j = 1; j <= 1000; j++) {

			int a = j;
			int count = 0;
//			중간계산 반복문(카운트 세기용)			
			for (int i = 2; i * i< a; i++) { 
				if (a % i == 0) {
					count++;
					break;
				}
			}
//		System.out.println("나머지가 0이 된 갯수 " + count);
			String str;
			if (count == 0) {
				str = (j + " : 소수");
			}/* else if (count == 1) {
				str = (j + " : 1");
			} */else {
				str = (j + " : 합성수");
			}
			System.out.println(str); //반복해야되므로 for문안에 들어가야됨
		}
	}
}
