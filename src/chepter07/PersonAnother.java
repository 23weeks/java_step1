package chepter07;

public class PersonAnother {

	String name;
	int age;
	
	public PersonAnother() {}
	
	//�̸��� ���� �ʱ�ȭ
	public PersonAnother(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	PersonAnother returnSelf() {
		return this;
	}
	
	public static void main(String[] args) {

		PersonAnother personAnother1 = new PersonAnother();
		System.out.println(personAnother1.name="��ġ");
		System.out.println(personAnother1.age=32);
		
		System.out.println("====");
		
		PersonAnother personAnother2 = new PersonAnother("�ڼ�", 28);
		System.out.println(personAnother2.name);
		System.out.println(personAnother2.age);
		
		PersonAnother add=personAnother2.returnSelf();
		System.out.println(add);
	}

}
