package chepter06;

public class Bus {

	//�������
	int busNumber;
	int passengerCount;
	int money;
	
	//����Ʈ������(����� ���Ѵٸ� ��������)
	public Bus() {}
	
	//�����ε�
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	public void take(int money) {	//�Ű������� �°��� �� �ݾ�
		this.money+=money;			//������ ���� ����
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(busNumber + "�� ������ " + "�°� ���� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
	
}
