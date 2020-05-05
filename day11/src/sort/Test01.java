package sort;

public class Test01 {
	public static void main(String[] args) {
//		배열의 정렬(sort)
//		-데이터를 원하는 순서대로 변경하는 것
//		-원하는 방식에 따라 오름차순(ascending), 내림차순(descending)으로 구분
//		-방식이 여러가지가 있음(청소와 비슷..)	
		
		int[] data = new int[] {3,5,2,1,4};
		
//		selection-sort 방식으로 data를 오름차순 정렬
//		-> 가장 작은 데이터를 찾아서 앞으로 옮긴다. 반복 횟수(data.length -1)번
		
		
		for(int i=0; i<data.length-1; i++) {			
			System.out.println(i+"번부터 "+(data.length-1)+"번까지 찾아요");
		}
		
	}
}
