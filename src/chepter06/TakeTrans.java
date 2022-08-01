package chepter06;


public class TakeTrans {

	public static void main(String[] args) {

		//학생2명의 객체를 생성
		StdInfo student1=new StdInfo("장다빈", 10000);
		StdInfo student2=new StdInfo("정단비", 12000);
		StdInfo student3=new StdInfo("김예중", 15000);
		StdInfo student4=new StdInfo("이세창", 13000);
	
		//버스타기
		Bus bus100=new Bus(100);
		Bus bus200=new Bus(200);
		Bus bus300=new Bus(300);
		
		student1.takeBus(bus100);
		student2.takeBus(bus200);
		student3.takeBus(bus300);
		student4.takeBus(bus300);
		
		
		//지하철타기
		Subway subway1=new Subway("1호선");
		Subway subway3=new Subway("3호선");
		Subway subway7=new Subway("7호선");
		
		student1.takeSubway(subway1);
		student2.takeSubway(subway3);
		student3.takeSubway(subway3);
		student4.takeSubway(subway7);
		
		
		//학생정보
		student1.showInfo();
		System.out.println("================================");
		student2.showInfo();
		System.out.println("================================");
		student3.showInfo();
		System.out.println("================================");
		student4.showInfo();
		System.out.println("================================");
		
		//버스정보
		bus100.showInfo();
		System.out.println("================================");
		bus200.showInfo();
		System.out.println("================================");
		bus300.showInfo();
		System.out.println("================================");
		
		//지하철정보
		subway1.showInfo();
		System.out.println("================================");
		subway3.showInfo();
		System.out.println("================================");
		subway7.showInfo();
	}

}
