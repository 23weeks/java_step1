package chepter06;

public class StudentInfoMain {

	public static void main(String[] args) {

		StudentInfo stulee=new StudentInfo();
		
		stulee.studentID=1004;
		System.out.println("�й� : " + stulee.studentID);
		
		stulee.grade=1;
		System.out.println("�г� : " + stulee.grade);
		
		//private ������� ���ٹ� = �޽�带 ���ؼ�'��' ����
		stulee.setStudentName("����");
		/*
		���1
		String name=stulee.getStudentName();
		System.out.println("�̸� : "+name);
		
		���2
		*/
		System.out.println("�̸� : "+stulee.getStudentName());
		
		stulee.address="���۱� �󵵵�";
		System.out.println("�ּ� : " + stulee.address);
	}

}
