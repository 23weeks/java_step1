package chepter04;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {

		// �л����� �Է¹޾� ������ �Է��ϰ� ��������Ʈ�� ����ϰ� ������ ����� �м��ϴ�

		boolean run = true;

		int studentNum = 0;
		int[] score = null;
		int count = 0;
		int sum = 0;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� |");
			System.out.println("-----------------------------------------------");
			System.out.print("����> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				System.out.print("�л� ���� �Է��ϼ��� : ");
				studentNum = Integer.parseInt(scan.nextLine());
				// System.out.println("�л� �� : " + studentNum);
				score = new int[studentNum];

			}else if (selectNo == 2) {
				for (int i=0; i<score.length; i++) {
					System.out.print("�л� " + (i + 1) + "�� ������ �Է��ϼ��� : ");
					int jumsu = Integer.parseInt(scan.nextLine());
					score[i] = jumsu;
					count++;
					sum += score[i];
				}

			} else if (selectNo == 3) {
				System.out.println("��������Ʈ");
				for (int i = 0; i < score.length; i++) {
					System.out.println("�л� " + (i + 1) + "�� ���� : " + score[i]);
				}

			} else if (selectNo == 4) {
				int max=0;
				double avg=0.0;
				for(int i=0; i<score.length; i++) {
					max= max < score[i] ? score[i] : max;
				}
				System.out.println("���� ������ ���� �л��� ������ : " + max + "�� �Դϴ�");
				System.out.println("�л����� ���� : " + sum + ", ��� : " + (double)(sum/count));
				
			}else {
				System.out.println("���Ḧ �����ϼ̽��ϴ�");
				run = false;
			}

		}

	}

}
