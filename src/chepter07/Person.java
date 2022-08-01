package chepter07;

public class Person {

	String name;
	float height;
	float weight;
	
	//기본 생성자
	public Person() {}

	//이름만 초기화되는 생성자
	public Person(String name) {
		this.name=name;
	}
	//멤버변수 모두 초기화되는 생성자
	public Person(String name, float height, float weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
			
	}
	
}
