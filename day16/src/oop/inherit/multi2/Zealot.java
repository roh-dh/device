package oop.inherit.multi2;

public class Zealot extends Protoss implements GroundUnit {

	@Override
	public void walk() {
		System.out.println("질럿 이동");
	}

	@Override
	public void attack() {
		System.out.println("질럿 공격");

	}

}
