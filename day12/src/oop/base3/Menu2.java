package oop.base3;

public class Menu2 {

	public static void main(String[] args) {
			
				
											
		
		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();
		
		a.name = "아메리카노";
		a.type = "음료";
		a.price = 1800;
		a.isEvent = true;

		b.name = "프라푸치노";
		b.type = "음료"	;	
		b.price = 3500;
		b.isEvent = false;
		
		c.name = "파니니";
		c.type	 = "식사";
		c.price = 2800;
		c.isEvent = true;

		d.name = "크로크무슈";
		d.type = "식사";	
		d.price =3300;
		d.isEvent = false;
		
		System.out.print(a.name+"\t");
		System.out.print(a.type+"\t");
		System.out.print(a.price+"\t");
		System.out.println(a.isEvent+"\t");
		
		
		System.out.print(b.name+"\t");
		System.out.print(b.type+"\t");
		System.out.print(b.price+"\t");
		System.out.println(b.isEvent+"\t");
		
		
		System.out.print(c.name+"\t");
		System.out.print(c.type+"\t");
		System.out.print(c.price+"\t");
		System.out.println(c.isEvent+"\t");
		
		
		System.out.print(d.name+"\t");
		System.out.print(d.type+"\t");
		System.out.print(d.price+"\t");
		System.out.println(d.isEvent);
		
		
// 왜 네줄씩 다 써야됨?		
		
	}

}
