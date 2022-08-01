package chepter06;

public class AccessTest {

	//필드 or 멤버변수
	
	private int aa;
	public int bb;
	int cc;
	
	//디폴트 생성자(public AccessTest()
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void Disp() {
		System.out.println("aa값 : " + aa + "\nbb값 : " + bb + "\ncc값 : " + cc);
	}
//===========================================================	
	public static void main(String[] args) {
		
		AccessTest obj=new AccessTest();		//객체생성(obj)
		obj.aa=10;
		//obj.setAa(10);
		obj.bb=20;
		//obj.setBb(20);
		obj.cc=30;
		//obj.setCc(30);
		obj.Disp();
	}
	
}
