package chepter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {

		Start game=new Start();
		
		Scanner scn=new Scanner(System.in);
		boolean run=true;
		
		while(run) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int num=scn.nextInt();
			game.check(num);
			if(game.getResult().equals("SUCCESS")) {	//��ü�� ==�δ� �� �Ұ�, String�� ������ equals
				run=false;
				System.out.println("���α׷� ����");
			}
		}
		
		
		
	}

}
//