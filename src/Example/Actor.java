package Example;

import java.util.Scanner;

public class Actor {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		String[][] actor = { {"[�۰�ȣ]", "����", "����", "����"},
							{"[�����]", "���ϵ�", "������ �׳�", "�����ϰ� �����ϰ�"},
							{"[�̺���]", "��������", "����", "����"}};
		
		int count=0;
		System.out.print("�˻��� ��� : ");
		String name = scn.next();
		for (int i=0; i<actor.length; i++) {
				if (actor[i][0].equals("["+name+"]")) {
					for (int j=0; j<actor[i].length; j++) {
					System.out.println(actor[i][j]);
					count++;
					}
				}
			
		}//for
	if ((count==0)){
		System.out.println("�ش� ��찡 �������� �ʽ��ϴ�.");
	}
	}//main

}

