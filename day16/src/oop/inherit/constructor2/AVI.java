package oop.inherit.constructor2;

public class AVI extends File{
	
	private double speed;

	public AVI(String filename) {
		super(filename);
		this.setSpeed(1);
//		this.speed = 1;
	}
	public AVI(String filename, long filesize, double speed) {
		super(filename, filesize);
		this.setSpeed(speed);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public void execute() {
		System.out.println("동영상을 "+this.speed+"배속으로 재생합니다");
	}
	
}

