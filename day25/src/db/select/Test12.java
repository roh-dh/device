package db.select;

import java.util.List;

import db.beans.ProductDao;
import db.beans.ProductDto;

public class Test12 {
	public static void main(String[] args) throws Exception {
//		목표 : ProductDao를 이용하여 상품 목록을 구한 뒤 출력(이름, 가격, 등)
		ProductDao pdao = new ProductDao();
		List<ProductDto> list = pdao.getList();
		
//		list 안에는 ProductDto(상품정보)들이 존재한다
		System.out.println("상품 개수 : "+list.size());
		
//		전체 목록을 보고 싶다면 반복문을 사용
		for(ProductDto pdto : list) {//확장 반복문(list의 데이터를 매 바퀴마다 pdto에 옮겨 담아라)
			System.out.println(pdto.getName()+" : "+pdto.getPrice());
		}
	}
}