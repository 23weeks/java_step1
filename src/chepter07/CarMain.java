package chepter07;

public class CarMain {

	public static void main(String[] args) {

		//Car car=new Car("���̺�", 3000);
		//System.out.println("���� ������ " + car.color + "�̰�, " + car.cc + "cc�Դϴ�.");
		
		//�����ڸ� ���� �Է�
		Car myCar=new Car("����", 3000);
		//myCar.color="ȭ��Ʈ";	//��������� Ȱ���� �Է�
		
		//��������� ���� ���� ��� - private�̸� ���ٸ���
		System.out.println("color�� : " + myCar.color + "�Դϴ�.");
		System.out.println("cc�� : " + myCar.cc + "cc�Դϴ�.");
		System.out.println("------------------------------");
		//�޼��带 �̿��ؼ� ���
		System.out.println("color�� : " + myCar.getColor() + "�Դϴ�.");
		System.out.println("cc�� : " + myCar.getCc() + "cc�Դϴ�.");
	}

}
