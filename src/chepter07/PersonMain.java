package chepter07;

public class PersonMain {

	public static void main(String[] args) {

		Person personKim = new Person();
		System.out.println(personKim.name="김유신");		//public이라 직접초기화가능
		System.out.println(personKim.height=180f);
		System.out.println(personKim.weight=80f);
		System.out.println("==================");
		
		Person personKang = new Person("강감찬");
		System.out.println(personKang.name);
		System.out.println(personKang.height=185f);
		System.out.println(personKang.weight=85f);
		System.out.println("==================");
		Person personLee = new Person("이순신", 175, 75);
		System.out.println(personLee.name);
		System.out.println(personLee.height);
		System.out.println(personLee.weight);
	}

}
 