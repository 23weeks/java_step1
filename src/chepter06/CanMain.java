package chepter06;

public class CanMain {

	public static void main(String[] args) {
		/*
		//�����ڸ� ���Ͽ� �ʱ�ȭ(��, ������ ���ڰ� public�̿�����)
		Can can=new Can("���⿡�̵�", 3800);
		
		System.out.print("���Ḧ �����ϼ��� : " + can.canName);
		System.out.println();
		System.out.print("������ : " + can.price);
		 */
	
		Can can=new Can();

		can.setCanName("û�������̵�");
		can.setPrice(3800);
	
		String dr=can.getCanName();
		int dk=can.getPrice();
		
		System.out.println("���Ḧ �����ϼ��� : " + dr);
		System.out.println("������ : " + dk);
		
	}

}
