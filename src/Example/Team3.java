package Example;

import java.util.Random;
import java.util.Scanner;

public class Team3 {
		
	public Team3() {
		Scanner scn = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int num3=0;
		
		do {
			num1 = new Random().nextInt(9)+1;
			num2 = new Random().nextInt(9)+1;
			num3 = new Random().nextInt(9)+1;	
			
		}while(num1 == num2 || num1 == num3 || num2 == num3);
		
		int user1=0;
		int user2=0;
		int user3=0;
		
		boolean run = true;
		while(run) {
			System.out.println("1 ~ 9 ������ ���ڸ� �Է��ϼ���");
			System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
			user1=scn.nextInt();
			System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
			user2=scn.nextInt();
			System.out.print("����° ���ڸ� �Է��ϼ��� : ");
			user3=scn.nextInt();
			
			int strike=0;			//while�� �ۿ� ������ strike�� ball�� ��� �����Ǹ鼭 
			int ball=0;				//���ߴ� ���� �����絵 �������� ����ó����.
			
			if (user1 == num1) {
				strike++;
			}else if ((user1 == num2) || (user1 == num3)) {
				ball++;
			}
			if (user2 == num2) {
				strike++;
			}else if ((user2 == num1) || (user2 == num3)) {
				ball++;
			}
			if (user3 == num3) {
				strike++;
			}else if ((user3 == num1) || (user3 == num2)){
				ball++;
			}
			if (strike == 3) {
				System.out.println("�����Դϴ�! - " + num1 + " " + num2 + " " + num3);
				run = false;
			}else {
				if((strike>0) || (ball>0)) {
					System.out.println(strike + " strike " + ball + " ball");
				}else
					System.out.println("OUT!!");
				System.out.println("=================================");
			}
		}
	}
}

