package chepter08;

public class Guide {

	static String point;
	Guest[] guest;	//����
	
	//�����ε� ������
	public Guide(int n) {
		point="�Ͽ���";
		guest=new Guest[n];		//�迭�� ����
	
	for(int i=0; i<guest.length; i++) {
		guest[i]=new Guest();
	}
	}
}
