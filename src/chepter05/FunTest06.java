package chepter05;

public class FunTest06 {

	public FunTest06() {
	}
	
	String channel;
	int volume;
	
	//void�ܿ� ��� Ÿ���� �ż���� �ݵ�� �� return���� ���´�.
	public int channelUp(int volume) {
		this.volume=volume;
		System.out.println("�Ҹ��� ���̰ڽ��ϴ�");
		return volume+2;
	}
	public void channelDown(int volume) {
		System.out.println("�Ҹ��� " + volume + "��ŭ �����ϴ�.");
		//return volume-2; //void�� ���� return���� ������ �� ����.
	}
	//�����ε�
	public void channelChange(String channel) {
		System.out.println("ä���� " + channel + "���� �ٲߴϴ�");
	}
	public void channelChange(int aa) {
		System.out.println("ä���� " + aa + "������ �ٲߴϴ�");
	}
		//==========================================================
	
	public static void main(String[] args) { //=========void�� return���� ������ ����

		FunTest06 tv=new FunTest06();
		
		System.out.println("�Ҹ��� " + tv.channelUp(3) + "��ŭ �ø��ϴ�");
		tv.channelDown(5);
		
		tv.channelChange("TVN");
		tv.channelChange(3);
	}

}
