package chepter06;

public class Subway {

	//멤버변수
	String LineNumber;
	int passengerCount;
	int money;
	
	//디폴트생성자(사용을 안한다면 생략가능)
	
	//오버로딩
	public Subway(String LineNumber) {
		this.LineNumber=LineNumber;
	}
	
	public void take(int money) {	//매개변수가 승객이 낸 금액
		this.money+=money;			//버스의 수입 증가
		passengerCount++;
		
	}
	
	public void showInfo() {
		System.out.println(LineNumber + "의 " + "승객 수는 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
	
	
}
