package api.util.arrays;import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {

		int[] data = new int[10];
		
		
		System.out.println(Arrays.toString(data));
//		for(int i=0; i< data.length; i++) {
//			System.out.print(data[i]+",");
//		}
		
		Arrays.fill(data, 10);
		System.out.println(Arrays.toString(data));
	}
}
