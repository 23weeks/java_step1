package chepter06;

public class GugudanTable {

	public void showTable(int num) {
		
		System.out.println(num + "��");
		//�޼���(�Լ�)
		for (int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
}
