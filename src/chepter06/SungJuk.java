package chepter06;

import javax.swing.JOptionPane;

public class SungJuk {

	//�ʵ� �Ǵ� �������
	private String std_num;
	private String std_name;
	private int java, oracle, spring;
	
	//����Ʈ ������
	
	//�޼���
	public void Sum() {
		
		int total=java+oracle+spring;
		System.out.print("���հ� : " + total);
	}
	public void Avg() {
		
		int avg=(java+oracle+spring)/3;
		System.out.print("��� : " + avg);
	}
	//===============================================================================
	public static void main(String[] args) {
		
		//rec��ü ����
		SungJuk rec=new SungJuk();
			
			rec.std_num=JOptionPane.showInputDialog("�й�");
			rec.std_name=JOptionPane.showInputDialog("�̸�");
	
			rec.java=Integer.parseInt(JOptionPane.showInputDialog("�ڹ������� �Է��ϼ���"));
			rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("����Ŭ������ �Է��ϼ���"));
			rec.spring=Integer.parseInt(JOptionPane.showInputDialog("������������ �Է��ϼ���"));
			
			System.out.println("�й� - " + rec.std_num + " | ���� - " + rec.std_name + " ���� �����Դϴ�.");
			System.out.println("=======================");
			rec.Sum();
			System.out.println();
			rec.Avg();
			
	}//main
		
}//class

