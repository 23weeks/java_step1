package chepter06;

public class StudentInfo {

	//필드
	int studentID;		//생략되면 public
	private String studentName;
	int grade;
	String address;
	
	
	//디폴트 생성자(free compile) = 오버로딩이 없는한 프리 컴파일이 가능하다/생략이 가능한채로 사용가능
	
	//메서드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}

