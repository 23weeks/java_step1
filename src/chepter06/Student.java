package chepter06;

public class Student {

	//�ʵ� or �������
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//����Ʈ ������
	public Student() {
		
	}
	//�����ε� ������
	public Student(String studentName, String address) {
		this.studentName=studentName;
		this.address=address;
	}
	//========================================
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//Ŀ���͸���¡ �޼���
	public void showStudent() {
		System.out.println("���� : " + studentName + ", " + "�ּ� : " + address);
	}
	
}
