package chepter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		//��������� �����Ͽ� static ȸ�������� ���
		StaticFunction st=new StaticFunction();
		System.out.println(st.str2);
		System.out.println(StaticFunction.str2);
		
		//�޼��带 �̿��Ͽ� static ȸ�� ������ ���
		System.out.println(StaticFunction.getStr2());
		System.out.println(StaticFunction.getStatic());
	}

}
