package chepter06;

public class StudentInfo {

	//�ʵ�
	int studentID;		//�����Ǹ� public
	private String studentName;
	int grade;
	String address;
	
	
	//����Ʈ ������(free compile) = �����ε��� ������ ���� �������� �����ϴ�/������ ������ä�� ��밡��
	
	//�޼���
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}

