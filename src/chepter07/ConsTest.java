package chepter07;

public class ConsTest {

	private int aa;
	private int bb;
	
	//����Ʈ������
	public ConsTest() {}
	
	//�����ε� ������
	public ConsTest(int aa, int bb) {			//public �̵� private�̵� �����ε��ϴ� ����� ���� �ٸ� ����ϴ� ����� �ٸ�
		this.aa=aa;								//private�� ����� ��쿡�� method�� ���ؼ��� ����� �����ϰų� ���� Ŭ���� �ȿ� ������ �־����
		this.bb=bb;
	}
	
	public static void main(String[] args) {
		//���1
		ConsTest obj1=new ConsTest();	//ConsTest�� �ִ� ������ ����ϰڴ� ��� ��ü����
		obj1.aa=10;
		obj1.bb=20;						//private ���� ��밡���� ���� : ���� class�� main�� �����ϹǷ� ��밡��
		System.out.println(obj1.aa);
		System.out.println(obj1.bb);
		
		//���2 - �����ε��� ����� ��ü����
		ConsTest obj2=new ConsTest(30, 40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);
	}

}
