package chepter08;

public class Student1 {

	public static int serialNum=10000;
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
}
