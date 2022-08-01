package chepter07;

public class ConsTest {

	private int aa;
	private int bb;
	
	//디폴트생성자
	public ConsTest() {}
	
	//오버로딩 생성자
	public ConsTest(int aa, int bb) {			//public 이든 private이든 오버로딩하는 방법은 동일 다만 사용하는 방법이 다름
		this.aa=aa;								//private를 사용할 경우에는 method를 통해서만 사용이 가능하거나 같은 클래스 안에 메인이 있어야함
		this.bb=bb;
	}
	
	public static void main(String[] args) {
		//방법1
		ConsTest obj1=new ConsTest();	//ConsTest에 있는 공간을 사용하겠다 라는 객체생성
		obj1.aa=10;
		obj1.bb=20;						//private 여도 사용가능한 이유 : 같은 class에 main이 존재하므로 사용가능
		System.out.println(obj1.aa);
		System.out.println(obj1.bb);
		
		//방법2 - 오버로딩을 사용한 객체생성
		ConsTest obj2=new ConsTest(30, 40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);
	}

}
