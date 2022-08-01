package chepter06;

public class StudentMain {

	public static void main(String[] args) {

		Student student1=new Student();		//heap 메모리를 사용하지만 공간이 다름
		//멤버변수 (name, address)
		//방법 1 : 멤버변수에 직접 초기화
		student1.studentName="상주";		//String 이니까 ""를 사용해줘야함
		student1.address="종로";			//
		//방법 1 출력
		System.out.println("성명 : "+student1.studentName);
		System.out.println("주소 : "+student1.address);
		
		//student1.showStudent();
		
		//방법 2 : 메서드 활용
		Student student2=new Student();		//
		student2.setStudentName("상주");
		student2.setAddress("종로");
		
		//방법 2 출력 = set이 되어있지 않으면 오류는 없지만 값은 없으므로 Null값이 나옴
		String a=student2.getStudentName();
		String b=student2.getAddress();
		System.out.println("성명 : " + a);
		System.out.println("주소 : " + b);
		
		student2.showStudent();
		
		//System.out.println("성명 : " + student2.getStudentName());
		//System.out.println("주소 : " + student2.getAddress());
		
		System.out.println("==========================");
		//오버로딩된 생성자를 이용하여 객체 생성한 케이스
		Student student3=new Student("상주", "상도동");
		student3.showStudent();
	}

}
