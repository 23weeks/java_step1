package chepter06;

public class StudentMain {

	public static void main(String[] args) {

		Student student1=new Student();		//heap �޸𸮸� ��������� ������ �ٸ�
		//������� (name, address)
		//��� 1 : ��������� ���� �ʱ�ȭ
		student1.studentName="����";		//String �̴ϱ� ""�� ����������
		student1.address="����";			//
		//��� 1 ���
		System.out.println("���� : "+student1.studentName);
		System.out.println("�ּ� : "+student1.address);
		
		//student1.showStudent();
		
		//��� 2 : �޼��� Ȱ��
		Student student2=new Student();		//
		student2.setStudentName("����");
		student2.setAddress("����");
		
		//��� 2 ��� = set�� �Ǿ����� ������ ������ ������ ���� �����Ƿ� Null���� ����
		String a=student2.getStudentName();
		String b=student2.getAddress();
		System.out.println("���� : " + a);
		System.out.println("�ּ� : " + b);
		
		student2.showStudent();
		
		//System.out.println("���� : " + student2.getStudentName());
		//System.out.println("�ּ� : " + student2.getAddress());
		
		System.out.println("==========================");
		//�����ε��� �����ڸ� �̿��Ͽ� ��ü ������ ���̽�
		Student student3=new Student("����", "�󵵵�");
		student3.showStudent();
	}

}
