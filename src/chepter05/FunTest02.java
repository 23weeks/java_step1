package chepter05;

import javax.swing.JOptionPane;

public class FunTest02 {

	public void sum(int num1, int num2) {
		int result=num1+num2;
		
		System.out.println(num1 + "+" + num2 + "=" + result);
		
	}
	
	public static void main(String[] args) {
		
		int a, b;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("a��"));
		b=Integer.parseInt(JOptionPane.showInputDialog("b��"));	
		
		//static���� ȣ����� �ʾ����Ƿ� �����߻�
		//sum(a,b);
		
		//�����ڸ� ���� ��ü����
		FunTest02 Obj=new FunTest02();
		Obj.sum(a,b);
	}

}
