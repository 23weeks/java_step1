package chepter06;

public class TryCatchThrows {
	/*
	 * Exception : 예기치 않은 사건(예외=이벤트)
	 * 최상의 예외 클래스 Exception
	 * 하위 예외 클래스(RuntimeException, NullPointerException(NPE), NumberFormatException, ClassCastException)
	 * 															 =형변환 오류				=클래스타입 설정오류
	 * 메서드에서 예외처리를 해서 덙미( 즉 메서드 구현시 try catch 문을 사용해서 만듬)
	 * throws 	: 상위클래스에 전달
	 * throw 	: 사용자 정의 - 직접 오류코드 클래스를 만들어놔야함
	 */
	
	

	public static void fun() throws Exception {		//new 를 쓸 때 | 스택을 쓰는게 아니고 heap을 써야해서 던져줘야(throws)가 있어야함
		//System.out.println("fun() 메서드 입니다.");
	
		try {
			System.out.println("fun() 메서드 입니다.");
		//	throw new Exception();		//예외처리 메서드를 사용할 자리를 설정해줌
		} catch (RuntimeException e) {		
			System.out.println("예외발생");	//서버 점검
		}finally {	//코드의 흐름상 에러가 있던 없던 무조건 수행해야하는 부분 
			System.out.println("finally 문장");		//close
		}
	}
	
	public static void main(String[] args) {

		//fun();
		
		try {
			
			fun(); //스택메모리에 있는것을 사용
			
		} catch (Exception e) {		//
			System.out.println("main()의 catch문입니다.");
		}
	}

}
