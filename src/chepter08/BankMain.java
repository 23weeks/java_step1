package chepter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {

		Bank bk1=new Bank("������", "010-1234-5678");
		//static�� Ŭ���������� ȣ���ؼ� ����Ѵ�.
		
		Bank.interest=0.2f;
		bk1.getBank();
		System.out.println("=====================");
		String point=JOptionPane.showInputDialog("����");
		String tel=JOptionPane.showInputDialog("��ȭ��ȣ");
		
		Bank bk2=new Bank(point, tel);
		System.out.print(point + " ������ ���ڸ� �Է��ϼ��� : ");
		Scanner scn=new Scanner(System.in);
		Bank.interest=scn.nextFloat();
	
		bk2.getBank();
	}

}
