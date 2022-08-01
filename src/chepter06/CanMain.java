package chepter06;

public class CanMain {

	public static void main(String[] args) {
		/*
		//생성자를 통하여 초기화(단, 접근한 정자가 public이여야함)
		Can can=new Can("딸기에이드", 3800);
		
		System.out.print("음료를 선택하세요 : " + can.canName);
		System.out.println();
		System.out.print("가격은 : " + can.price);
		 */
	
		Can can=new Can();

		can.setCanName("청포도에이드");
		can.setPrice(3800);
	
		String dr=can.getCanName();
		int dk=can.getPrice();
		
		System.out.println("음료를 선택하세요 : " + dr);
		System.out.println("가격은 : " + dk);
		
	}

}
