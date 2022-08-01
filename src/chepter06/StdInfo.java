package chepter06;

public class StdInfo {

	//필드
	public String studentName;
	public int grade;
	public int money;
	
	//디폴트생성자(사용할거면 명시해줘야함)
	public StdInfo() {}
	
	//오버로딩 생성자
	public StdInfo(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	//버스
	public void takeBus(Bus bus) {	//매개변수가 객체
		bus.take(1000);
		this.money-=1000;	//학생
	}
	
	//지하철
	public void takeSubway(Subway subway) {
		subway.take(1250);
		this.money-=1250;	//학생
	}
	
	//남은 잔액
	public void showInfo() {
		System.out.println(studentName + "님의 남은 잔액은 " + money + "원 입니다.");
	}
}
