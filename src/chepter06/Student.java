package chepter06;

public class Student {

	//필드 or 멤버변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//디폴트 생성자
	public Student() {
		
	}
	//오버로딩 생성자
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
	//커스터마이징 메서드
	public void showStudent() {
		System.out.println("성명 : " + studentName + ", " + "주소 : " + address);
	}
	
}
