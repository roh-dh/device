package oop.modifier4;

public class Address {

//	데이터 필드
	String zipCode;
	String basicAddress;
	String detailedAddres;
	
//	setter
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setBasicAddress(String basicAddress) {
		this.basicAddress = basicAddress;
	}
	public void setDetailedAddres(String detailedAddres) {
		this.detailedAddres = detailedAddres;
	}
	
	
//	getter
	public String getZipCode() {
		return zipCode;
	}
	public String getBasicAddress() {
		return basicAddress;
	}
	public String getDetailedAddres() {
		return detailedAddres;
	}
	
// 배송지클래스
	public Address(String zipCode,String basicAddress,String detailedAddres) {
		this.setZipCode(zipCode);
		this.setBasicAddress(basicAddress);
		this.setDetailedAddres(detailedAddres);
	}

// 출력
	void output() {
		System.out.println("우편번호 "+this.zipCode);
		System.out.println("기본주소 "+this.basicAddress);
		System.out.println("상세주소 "+this.detailedAddres);
		
	}
	
	
	
	
}
