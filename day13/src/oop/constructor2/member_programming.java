package oop.constructor2;

public class member_programming {
	public static void main(String[] args) {
		Member a = new Member("tester", "test1234");
		Member b = new Member("admin","admin1234" , "운영자", -99999);
		Member c = new Member("user", "user1234");
		
		a.output();
		b.output();
		c.output();
		
		
		
	}
}
