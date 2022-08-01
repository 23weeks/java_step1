package chepter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		//멤버변수를 참조하여 static 회원변수를 출력
		StaticFunction st=new StaticFunction();
		System.out.println(st.str2);
		System.out.println(StaticFunction.str2);
		
		//메서드를 이용하여 static 회원 변수를 출력
		System.out.println(StaticFunction.getStr2());
		System.out.println(StaticFunction.getStatic());
	}

}
