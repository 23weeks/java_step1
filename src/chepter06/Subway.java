package chepter06;

public class Subway {

	//�������
	String LineNumber;
	int passengerCount;
	int money;
	
	//����Ʈ������(����� ���Ѵٸ� ��������)
	
	//�����ε�
	public Subway(String LineNumber) {
		this.LineNumber=LineNumber;
	}
	
	public void take(int money) {	//�Ű������� �°��� �� �ݾ�
		this.money+=money;			//������ ���� ����
		passengerCount++;
		
	}
	
	public void showInfo() {
		System.out.println(LineNumber + "�� " + "�°� ���� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
	
	
}
