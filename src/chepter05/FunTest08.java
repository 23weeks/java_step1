package chepter05;

public class FunTest08 {
	//����Լ��� ���� ���� = for ������ ����� �������� ����� ���� �ٿ��� �����ϰ� Ȯ���� �����ؼ�.
	//�ʵ� �Ǵ� �������
	
	//����Ʈ ������ (������ ������ ���� = FunTest08)
	
	//�޼���
	public static int Recur(int a) {
		
		int result;
		System.out.print(a + " ");
		
		if (a == 1) {
			return(1);	//return 1�� �극��ũ�� ��°Ͱ� �Ȱ��� : ��������� �ƴ����� �������� �����ϱ� ���� �ڵ�
			
		}else result=a*Recur(a-1);
		
		return result;
		
		//return 0;		//���� ������ �Ѿ ���� ������ �˸� /return ���� ���� �� 0�� �� (false)
		
	}
	
	
	public static void main(String[] args) {
		/*
		//static�� �ƴ� ��� ��ü�� �����Ͽ� �޼��� ���
		FunTest08 re=new FunTest08();
		re.Recur(5);
		*/
		int res;
		int x=5;
		System.out.println("����� main�Դϴ�");
		System.out.println("�޼��� ȣ��");
		res=Recur(x);
		System.out.println();
		System.out.println("�Լ�(�޼���) ȣ�� �� �����");
		System.out.print("1 ~ " + x + "������ ���� ���� �� : " + res);
		
	}

}
