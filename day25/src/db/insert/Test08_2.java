package db.insert;

import java.util.Scanner;

import db.beans.ProductDao;
import db.beans.ProductDto;

public class Test08_2 {
	public static void main(String[] args) throws Exception {
		//준비
		ProductDto pdto = new ProductDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");			pdto.setName(sc.nextLine());
		System.out.println("유형 입력");			pdto.setType(sc.nextLine());
		System.out.println("가격 입력");			pdto.setPrice(sc.nextInt());
		sc.nextLine();//엔터 처리
		System.out.println("제조일 입력");		pdto.setMade(sc.nextLine());
		System.out.println("유통기한 입력");	pdto.setExpire(sc.nextLine());
		sc.close();
		
		//처리
		ProductDao pdao = new ProductDao();
//		pdao.regist(name, type, price, made, expire);//낱개 데이터를 추가
		pdao.regist(pdto);//객체를 이용한 추가
	}
}
