package chepter05;

import java.util.Scanner;

public class FunTest07 {

	public FunTest07() {
	}
	//return���� �ִ� ���
	/*
	public static String Edustep(int Edu) {
		Scanner scn=new Scanner(System.in);
		String step;
	
		//1->1�ܰ� 2->2�ܰ� 3->3�ܰ� �� �� �Էµ� ���͵� �����ϴ�.
		if (Edu == 1) {
			step="1�ܰ�";
			
		}else if (Edu == 2) {
			step="2�ܰ�";
			
		}else if (Edu == 3) {
			step="3�ܰ�";
			
		}else
			step="���͵�ܰ谡 �����ϴ�";
			return step;
	}
	*/
	//return���� ���� ���
	public static void Edustep(int Edu) {
		
		if (Edu == 1) {
			System.out.println("���� ���͵� �ܰ�� step1 �Դϴ�");
		}else if (Edu == 2) {
			System.out.println("���� ���͵� �ܰ�� step" + Edu + " �Դϴ�");
		}else if (Edu == 3) {
			System.out.println("���� ���͵� �ܰ�� step" + Edu + " �Դϴ�");			
		}else
			System.out.println("�ش��ϴ� ���͵� �ܰ谡 �����ϴ�");
	}
	

	
	public static void main(String[] args) {		//void = ����ִ�, return���� ���ٴ� ��
		
		Scanner scn=new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ��� : ");
		int num=scn.nextInt();
		//return ���� �ִ� ��� �ż��� ȣ���ϴ� ��
		//System.out.println("���� ���� �ܰ�� : " + Edustep(num) + " �Դϴ�");
		
		//return ���� ���� ��� �ż��� ȣ���ϴ� ��
		Edustep(num);
	}

}
