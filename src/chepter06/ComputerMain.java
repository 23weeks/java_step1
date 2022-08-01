package chepter06;

public class ComputerMain {

	public static void main(String[] args) {

		Computer myCom=new Computer();		//按眉 积己
		//规过1
		int[] values1= {1,2,3,4,5};
		int result1=myCom.sum1(values1);
		System.out.println("result : " + result1);
		
		
		System.out.println("=====================");
		//规过2
		int result2=myCom.sum1(new int[] {1,2,3});
		System.out.println("result : " + result2);
		//========================================
		
		System.out.println("=====================");
		//规过3
		int result3=myCom.sum2(1,2,3,4,5);
		System.out.println("result : " + result3);
		
		
		System.out.println("=====================");
		int result4=myCom.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("result : " + result4);
	}

}
