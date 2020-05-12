package oop.inherit.multi2;

public class SCV extends Terran implements GroundUnit, Worker {

	@Override
	public void mine() {
		System.out.println("SCV 채취");
	}

	@Override
	public void walk() {
		System.out.println("SCV 이동");
	}

	@Override
	public void attack() {
		System.out.println("SCV 공격");
	}

}
