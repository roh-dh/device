package oop.inherit.multi2;

public class Wraith extends Terran implements FlyingUnit{

	@Override
	public void fly() {
System.out.println("레이스 이동");
		
	}

	@Override
	public void attack() {
System.out.println("레이스 공격");		
	}

}
