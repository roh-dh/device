package db.insert;

import java.util.Scanner;

import db.beans.ProductDao;

public class Test08 {
	public static void main(String[] args) throws Exception {
		//준비
		String name = "바밤바";
		String type = "아이스크림";
		int price = 800;
		String made = "2019-11-01";
		String expire = "2020-08-01";
		
		//처리
		ProductDao pdao = new ProductDao();
		pdao.regist(name, type, price, made, expire);
	}
}

