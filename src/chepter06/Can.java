package chepter06;

public class Can {

	//필드 or 멤버변수
	private String canName;
	private int price;
	
	//디폴트 생성자
	public Can() {

	}
	
	//오버로딩 생성자
	
	public Can(String canName, int price) {
		this.canName=canName;
		this.price=price;
	}

	//============메서드(함수)===============
	public void setCanName(String canName) {
		this.canName = canName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	
}
