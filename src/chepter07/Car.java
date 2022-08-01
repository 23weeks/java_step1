package chepter07;

public class Car {

	String color;
	int cc;
	
	public Car() {}
	
	public Car(String color, int cc) {
		this.color=color;
		this.cc=cc;
	}
	//======================================================
	//마우스 우클릭 > 소스 > getter and setter 들어가서 필요한것들 생성
	public String getColor() {
		return color;
	}

	public int getCc() {
		return cc;
	}
	
	
	
}
