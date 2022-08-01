package chepter07;

public class OverloadMain {

	public static void main(String[] args) {

		Overload Ov1 = new Overload(28, 173, "23week");
		Overload Ov2 = new Overload(28, 173);
		Overload Ov3 = new Overload();
		
		Ov1.Disp();
		System.out.println("============");
		Ov2.Disp();
		System.out.println("============");
		Ov3.Disp();
		
	}

}
