package chepter05;

import javax.swing.JOptionPane;

public class FunTest01 {

	public static void main(String[] args) {

		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("a��"));
		b=Integer.parseInt(JOptionPane.showInputDialog("b��"));
		
		sum(a,b);
		
	}

	//�հ� �ż���(�Լ�) ============ C���� ���̽���� �ٸ��� �� ������ �־���ϴ°� �ƴ�! (Java�� ��� ��)
	//������ �������� �Ͽ� ���� ���� �� �Ǵ� �Ŀ� �����ص� ��
	public static void sum(int a, int b) {
		int total=a+b;
		System.out.println("�� ���� �� : " + total);
		
	}
	
}
