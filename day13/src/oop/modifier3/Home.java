package oop.modifier3;

public class Home {

	private int roomSize; // 평형
	private int roomCount; // 방개수
	private int bathroomCount; // 화장실개수
	private boolean isBalcony; // 발코니 확장여부
	private int price; // 가격

// setter 메소드 5개	
	public void setRoomSize(int roomsize) {
		switch(roomSize) {
		case 25: case 28: case 31: case 34: case 45:
		}
		this.roomSize = roomsize;
	}

	public void setRoomCount(int roomCount) {

		if(roomCount>=1){		
			this.roomCount = roomCount;
		}
	}

	public void setBathroomCount(int bathroomCount) {
		if(bathroomCount>=1) {
			this.bathroomCount = bathroomCount;			
		}
	}

	public void setIsBalcony(boolean isBalcony) {

		this.isBalcony = isBalcony;		
	}

	public void setPrice(int price) {
		if(price>=0){
			this.price = (price/1000000)*1000000;		
		}
	}

// getter 메소드 5개
	public int getRoomSize() {
		return this.roomSize;
	}

	
	public int getRoomCount() {
		return this.roomCount;
	}

	public int getBathroomCount() {
		return this.bathroomCount;
	}

	public boolean getIsBalcony() {
		return this.isBalcony;
	}

	public int getPrice() {
		return this.price;
	}

//생성자	
	public Home(int roomSize, int roomCount, int bathroomCount, boolean isBalcony, int price) {
		this.setRoomSize(roomSize);
		this.setRoomCount(roomCount);
		this.setBathroomCount(bathroomCount);
		this.setIsBalcony(isBalcony);
		this.setPrice(price);

	}
	
//기타메소드
	public void output() {
		System.out.println("평형 : "+this.roomSize+"평형");
		System.out.println("방개수 : "+this.roomCount);
		System.out.println("화장실 개수 : "+this.bathroomCount);
		System.out.println("발코니 확장여부 : "+this.isBalcony);
		System.out.println("할인 전 가격 : "+this.price);
		if(isBalcony==false) {
			System.out.println("할인 후 가격 : "+(price -(price*5/100)));
		}	
		System.out.println("");
		System.out.println();
	}

}	
