package chepter06;

public class MyDateMain {

	public static void main(String[] args) {
		//객체 생성
		MyDate date=new MyDate();
		
		date.year=2022;
		date.month=06;
		date.day=27;
		
		System.out.println(date.year + "년 " + date.month + "월 " + date.day + "일");
	}

}
