package chepter07;

public class PersonMain {

	public static void main(String[] args) {

		Person personKim = new Person();
		System.out.println(personKim.name="������");		//public�̶� �����ʱ�ȭ����
		System.out.println(personKim.height=180f);
		System.out.println(personKim.weight=80f);
		System.out.println("==================");
		
		Person personKang = new Person("������");
		System.out.println(personKang.name);
		System.out.println(personKang.height=185f);
		System.out.println(personKang.weight=85f);
		System.out.println("==================");
		Person personLee = new Person("�̼���", 175, 75);
		System.out.println(personLee.name);
		System.out.println(personLee.height);
		System.out.println(personLee.weight);
	}

}
 