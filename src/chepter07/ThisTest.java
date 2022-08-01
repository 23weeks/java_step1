package chepter07;

public class ThisTest {

	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;
	
	
	
	public ThisTest() {}
	public ThisTest(int Speed, int Age, String RobotName, String RobotNum) {
		this.Age=Age;
		this.Speed=Speed;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}

	public void Move() {
		Speed+=20;
		System.out.println("RobotSpeed : " + Speed);
	}
	
	public void Stop() {
		Speed=0;
		System.out.println("RobotSpeed : " + Speed);
	}
	
	public void RAge() {
		Age +=1;
		System.out.println("RobotAge : " + Age);
	}
	
	public void RName() {
		System.out.println("RobotName : " + RobotName);
	}
	
	
	//=====================
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getRobotName() {
		return RobotName;
	}
	public void setRobotName(String robotName) {
		RobotName = robotName;
	}
	public String getRobotNum() {
		return RobotNum;
	}
	public void setRobotNum(String robotNum) {
		RobotNum = robotNum;
	}
	
	
}
