package chepter06;

public class Bus {

	//멤버변수
	int busNumber;
	int passengerCount;
	int money;
	
	//디폴트생성자(사용을 안한다면 생략가능)
	public Bus() {}
	
	//오버로딩
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	public void take(int money) {	//매개변수가 승객이 낸 금액
		this.money+=money;			//버스의 수입 증가
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(busNumber + "번 버스의 " + "승객 수는 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
	
}
