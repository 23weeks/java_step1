package chepter05;

public class FunTest_Overloading {

	//필드 = 멤버변수
	
	//생성자(디폴트 생략)
	
	//================================
	//다형성을 만족한다
	//Overloading : 메서드명을 통일성 있게 사용해야 하는 경우 메서드의 매개변수를 종류와 갯수를 다르게하여 구현
	public void getResult(int n) {
		System.out.println(n + "은(는) int 입니다");
	}
	
	public void getResult(char n) {
		System.out.println(n + "은(는) char 입니다");
	}
	
	public void getResult(String n) {
		System.out.println(n);
	}
	
	public void getResult(int n, String str) {
		System.out.println(n + "월은 "+ str + "입니다");
	}
	
}
