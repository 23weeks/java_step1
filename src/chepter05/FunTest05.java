package chepter05;

public class FunTest05 {

	public FunTest05() {
	}
	
	String channel;
	int volume;
	
	public void channelUp(int volume) {
		System.out.println("�Ҹ��� " + volume + "��ŭ �ø��ϴ�.");
	}
	
	public void channelDown(int volume) {
		System.out.println("�Ҹ��� " + volume + "��ŭ �ø��ϴ�.");
	}
	//�����ε�
	public void channelChange(String channel) {
		System.out.println("ä���� " + channel + "���� �ٲߴϴ�");
	}
	public void channelChange(int channelInt) {
		System.out.println("ä���� " + channelInt + "������ �ٲߴϴ�");
		
	}
	
		//==========================================================
	
	public static void main(String[] args) {

		FunTest05 tv=new FunTest05();
		
		tv.channelUp(3);
		tv.channelDown(5);
		tv.channelChange("TVN");
		tv.channelChange(5);
		
	}

}
