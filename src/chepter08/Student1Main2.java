package chepter08;

public class Student1Main2 {

	public static void main(String[] args) {

		Student2 studentLee = new Student2();
		studentLee.setStudentName("����");
		System.out.println("�̸� : " +studentLee.getStudentName() + " | �й� : " +Student2.serialNum);
		System.out.println("==============");
		//System.out.println(studentLee.serialNum);
		
		Student2 studentSang = new Student2();
		studentSang.setStudentName("23weeks");
		System.out.println("�̸� : " +studentSang.getStudentName() + " | �й� : " + Student2.serialNum);
		System.out.println("==============");
	}

		
}
