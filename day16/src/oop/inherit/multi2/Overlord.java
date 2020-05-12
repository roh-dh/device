package oop.inherit.multi2;

public class Overlord extends Zerg implements FlyingUnit {

	@Override
	public void fly() {
		System.out.println("오버로드 비행");
	}

	@Override
	public void attack() {
		System.out.println("오버로드 공격?!");
	}

}
