package chepter06;

public class StdInfo {

	//�ʵ�
	public String studentName;
	public int grade;
	public int money;
	
	//����Ʈ������(����ҰŸ� ����������)
	public StdInfo() {}
	
	//�����ε� ������
	public StdInfo(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	//����
	public void takeBus(Bus bus) {	//�Ű������� ��ü
		bus.take(1000);
		this.money-=1000;	//�л�
	}
	
	//����ö
	public void takeSubway(Subway subway) {
		subway.take(1250);
		this.money-=1250;	//�л�
	}
	
	//���� �ܾ�
	public void showInfo() {
		System.out.println(studentName + "���� ���� �ܾ��� " + money + "�� �Դϴ�.");
	}
}
