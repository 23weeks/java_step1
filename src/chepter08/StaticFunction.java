package chepter08;

public class StaticFunction {

	String str1="�Ϲ� ȸ���� ����";
	static String str2="static ȸ�� ����";
	
	public static String getStatic() {
		
		//return str1;	//ERROR : static�޼���� static�� return�� ������
		return str2;
	}

	public static String getStr2() {
		return str2;
	}

	public static void setStr2(String str2) {
		StaticFunction.str2 = str2;
	}
	
	
	
}
