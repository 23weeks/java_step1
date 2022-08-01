package chepter07;

public class PersonAnother {

	String name;
	int age;
	
	public PersonAnother() {}
	
	//이름과 나이 초기화
	public PersonAnother(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	PersonAnother returnSelf() {
		return this;
	}
	
	public static void main(String[] args) {

		PersonAnother personAnother1 = new PersonAnother();
		System.out.println(personAnother1.name="김치");
		System.out.println(personAnother1.age=32);
		
		System.out.println("====");
		
		PersonAnother personAnother2 = new PersonAnother("박수", 28);
		System.out.println(personAnother2.name);
		System.out.println(personAnother2.age);
		
		PersonAnother add=personAnother2.returnSelf();
		System.out.println(add);
	}

}
