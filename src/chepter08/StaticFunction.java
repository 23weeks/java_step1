package chepter08;

public class StaticFunction {

	String str1="일반 회원의 변수";
	static String str2="static 회원 변수";
	
	public static String getStatic() {
		
		//return str1;	//ERROR : static메서드는 static만 return이 가능함
		return str2;
	}

	public static String getStr2() {
		return str2;
	}

	public static void setStr2(String str2) {
		StaticFunction.str2 = str2;
	}
	
	
	
}
