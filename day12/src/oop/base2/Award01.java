package oop.base2;

public class Award01 {
	public static void main(String[] args) {
		//player 클래스를 이용하여 객체 생성
		
		Award a = new Award();
		Award b = new Award();
		Award c = new Award();
				
//		설정
		 a.name = "김연아";
		 a.event = "피겨스케이팅";
		 a.gold = 3;
		 a.silver = 1;
		 a.bronze = 0;
		 
		 b.name = "이상화";
		 b.event = "스피드스케이팅";
		 b.gold = 2;
		 b.silver = 3;
		 b.bronze = 3;
		 
		 c.name = "윤성빈";
		 c.event = "스켈레톤";
		 c.gold = 1;
		 c.silver = 0;
		 c.bronze = 1;
		
//		출력		
		 System.out.print(a.name+"\t");
		 System.out.print(a.event+"\t");
		 System.out.print(a.gold+"\t");
		 System.out.print(a.silver+"\t");
		 System.out.println(a.bronze+"\t");
		 
		 System.out.print(b.name+"\t");
		 System.out.print(b.event+"\t");
		 System.out.print(b.gold+"\t");
		 System.out.print(b.silver+"\t");
		 System.out.println(b.bronze+"\t");
		 
		 System.out.print(c.name+"\t");
		 System.out.print(c.event+"\t");
		 System.out.print("\t"+c.gold+"\t");
		 System.out.print(c.silver+"\t");
		 System.out.print(+c.bronze+"\t");
	}

}
