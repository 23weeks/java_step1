package chepter05;

public class FunTest06 {

	public FunTest06() {
	}
	
	String channel;
	int volume;
	
	//void외에 모든 타입의 매서드는 반드시 꼭 return값을 갖는다.
	public int channelUp(int volume) {
		this.volume=volume;
		System.out.println("소리를 높이겠습니다");
		return volume+2;
	}
	public void channelDown(int volume) {
		System.out.println("소리를 " + volume + "만큼 내립니다.");
		//return volume-2; //void는 절대 return값이 존재할 수 없다.
	}
	//오버로딩
	public void channelChange(String channel) {
		System.out.println("채널을 " + channel + "으로 바꿉니다");
	}
	public void channelChange(int aa) {
		System.out.println("채널을 " + aa + "번으로 바꿉니다");
	}
		//==========================================================
	
	public static void main(String[] args) { //=========void는 return값을 가지지 않음

		FunTest06 tv=new FunTest06();
		
		System.out.println("소리를 " + tv.channelUp(3) + "만큼 올립니다");
		tv.channelDown(5);
		
		tv.channelChange("TVN");
		tv.channelChange(3);
	}

}
