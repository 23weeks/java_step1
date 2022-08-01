package chepter04;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {

		// 학생수를 입력받아 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석하는

		boolean run = true;

		int studentNum = 0;
		int[] score = null;
		int count = 0;
		int sum = 0;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 |");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				System.out.print("학생 수를 입력하세요 : ");
				studentNum = Integer.parseInt(scan.nextLine());
				// System.out.println("학생 수 : " + studentNum);
				score = new int[studentNum];

			}else if (selectNo == 2) {
				for (int i=0; i<score.length; i++) {
					System.out.print("학생 " + (i + 1) + "의 점수를 입력하세요 : ");
					int jumsu = Integer.parseInt(scan.nextLine());
					score[i] = jumsu;
					count++;
					sum += score[i];
				}

			} else if (selectNo == 3) {
				System.out.println("점수리스트");
				for (int i = 0; i < score.length; i++) {
					System.out.println("학생 " + (i + 1) + "의 점수 : " + score[i]);
				}

			} else if (selectNo == 4) {
				int max=0;
				double avg=0.0;
				for(int i=0; i<score.length; i++) {
					max= max < score[i] ? score[i] : max;
				}
				System.out.println("가장 점수가 높은 학생의 점수는 : " + max + "점 입니다");
				System.out.println("학생들의 총점 : " + sum + ", 평균 : " + (double)(sum/count));
				
			}else {
				System.out.println("종료를 선택하셨습니다");
				run = false;
			}

		}

	}

}
