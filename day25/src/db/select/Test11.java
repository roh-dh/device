package db.select;

import db.beans.ProductDao;

public class Test11 {
	public static void main(String[] args) throws Exception {
		ProductDao pdao = new ProductDao();
		int count = pdao.getCount();
		
		System.out.println("상품 개수 : "+count);
	}
}