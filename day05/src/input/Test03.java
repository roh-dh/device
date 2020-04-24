package input;
import java.lang.*;
import java.util.*;

public class Test03 {
	
	public static void main(String[] args) {
//		실수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요");
		double cm = sc.nextDouble();
		
		System.out.println("입력하신 키 : "+cm);
	
		sc.close();
		
	}

}
