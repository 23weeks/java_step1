package chepter07;

public class CarMain {

	public static void main(String[] args) {

		//Car car=new Car("네이비", 3000);
		//System.out.println("차의 색상은 " + car.color + "이고, " + car.cc + "cc입니다.");
		
		//생성자를 통한 입력
		Car myCar=new Car("검정", 3000);
		//myCar.color="화이트";	//멤버변수를 활용한 입력
		
		//멤버변수에 직접 접근 출력 - private이면 접근못함
		System.out.println("color는 : " + myCar.color + "입니다.");
		System.out.println("cc는 : " + myCar.cc + "cc입니다.");
		System.out.println("------------------------------");
		//메서드를 이용해서 출력
		System.out.println("color는 : " + myCar.getColor() + "입니다.");
		System.out.println("cc는 : " + myCar.getCc() + "cc입니다.");
	}

}
