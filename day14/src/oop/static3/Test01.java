package oop.static3;

public class Test01 {
	public static void main(String[] args) {
//	static 항목들은 객체 없이도 접근 및 변경이 가능하다.
	System.out.println(Sonata.Company);	
	System.out.println(Sonata.seat);	
	
	Sonata a = new Sonata();
	a.color = "블랙";
	a.price = 25000000;
	
	Sonata b = new Sonata();
	b.color = "메탈그레이";
	b.price = 3000000;		
			
	
	System.out.println(a.Company);
	
	
	}
}
