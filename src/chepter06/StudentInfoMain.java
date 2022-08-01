package chepter06;

public class StudentInfoMain {

	public static void main(String[] args) {

		StudentInfo stulee=new StudentInfo();
		
		stulee.studentID=1004;
		System.out.println("학번 : " + stulee.studentID);
		
		stulee.grade=1;
		System.out.println("학년 : " + stulee.grade);
		
		//private 멤버변수 접근법 = 메써드를 통해서'만' 가능
		stulee.setStudentName("상주");
		/*
		방법1
		String name=stulee.getStudentName();
		System.out.println("이름 : "+name);
		
		방법2
		*/
		System.out.println("이름 : "+stulee.getStudentName());
		
		stulee.address="동작구 상도동";
		System.out.println("주소 : " + stulee.address);
	}

}
