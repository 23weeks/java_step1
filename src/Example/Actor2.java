package Example;

import java.util.Scanner;

public class Actor2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int count = 0;
		
		String[][] actor2 = {	{"[�۰�ȣ]", "����", "����", "����"},
								{"[�����]", "���ϵ�", "������ �׳�", "�����ϰ� �����ϰ�"},
								{"[�̺���]", "��������", "����", "����"}};

		System.out.print("�˻��� ��� : ");
		String name = scn.next();
		
		for (int i = 0; i<actor2.length; i++) {
			
			if (actor2[i][0].equals("[" + name + "]")){
				for(int j=0; j<actor2[i].length; j++) {
					System.out.println(actor2[i][j]);
					count++;
				}
			}
		}if (count == 0) {
			System.out.println("�ش� ��찡 �������� �ʽ��ϴ�.");
		}
	}

}
