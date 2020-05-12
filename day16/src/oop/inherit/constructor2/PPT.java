package oop.inherit.constructor2;

public class PPT extends File{

	private int size;
	
	public PPT(String filename) {
		super(filename);
		this.setSize(1);
	}
	
	public PPT(String filename, long filesize, int size) {
		super(filename, filesize);
		this.setSize(size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size < 0) return;
		this.size = size;
	}
	
	@Override
	public void execute() {
		System.out.println("파워포인트 슬라이드 재생(총 "+this.size+"페이지)");
	}
}