package chepter06;

import java.util.Scanner;

public class Venmain {
	
	

	public static void main(String[] args) {
		
		int money=0;
		String select="";
		
		Vending ven=new Vending();		//��ü ����
		ven.Init();	//�����غ�
		
		System.out.print("���� �����ϼ��� : ");
		Scanner scn=new Scanner(System.in);
		money=scn.nextInt();
		ven.showCans(money);
		
		System.out.print("���Ḧ �����ϼ��� : ");
		select=scn.next();
		ven.OutCan(select);
		
	}

}
