package chepter06;

public class GugudanTable {

	public void showTable(int num) {
		
		System.out.println(num + "단");
		//메서드(함수)
		for (int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
}
