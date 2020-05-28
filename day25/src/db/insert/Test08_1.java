package db.insert;

import java.util.Scanner;

import db.beans.ProductDao;

public class Test08_1 {
	public static void main(String[] args) throws Exception {
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");			String name = sc.nextLine();
		System.out.println("유형 입력");			String type = sc.nextLine();
		System.out.println("가격 입력");			int price = sc.nextInt();
		sc.nextLine();//엔터 처리
		System.out.println("제조일 입력");		String made = sc.nextLine();
		System.out.println("유통기한 입력");	String expire = sc.nextLine();
		sc.close();
		
		//처리
		ProductDao pdao = new ProductDao();
		pdao.regist(name, type, price, made, expire);
	}
}
