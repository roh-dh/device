package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {
//	상황 : 1/n 계산기
		try {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액 입력");
		long price = sc.nextLong();
		
		System.out.println("인원수 입력");
		int people = sc.nextInt();
		
		sc.close();
		
		long a = price / people;
		long b = price % people;
		
		System.out.println("한명당 "+a+"원");
		System.out.println("남은돈 "+b+"원");
	}
//		catch(RuntimeException e ){
		catch(Exception e) {
			System.err.println("야이 바보야!");
			//오류 메세지가 없으니까 문제 해결은 어려워짐...!
			
		}

//		int나 long 범위보다 크게.
//		금액과 인원수 0
//		다른 자료형 입력
		
	}
}
