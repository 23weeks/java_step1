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
			System.out.println("1 ~ 9 사이의 숫자를 입력하세요");
			System.out.print("첫번째 숫자를 입력하세요 : ");
			user1=scn.nextInt();
			System.out.print("두번째 숫자를 입력하세요 : ");
			user2=scn.nextInt();
			System.out.print("세번째 숫자를 입력하세요 : ");
			user3=scn.nextInt();
			
			int strike=0;			//while문 밖에 있으면 strike랑 ball이 계속 누적되면서 
			int ball=0;				//원했던 답을 못맞춰도 누적으로 정답처리됨.
			
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
				System.out.println("정답입니다! - " + num1 + " " + num2 + " " + num3);
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

