package chepter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {

		Start game=new Start();
		
		Scanner scn=new Scanner(System.in);
		boolean run=true;
		
		while(run) {
			System.out.print("숫자를 입력하세요 : ");
			int num=scn.nextInt();
			game.check(num);
			if(game.getResult().equals("SUCCESS")) {	//객체라서 ==로는 비교 불가, String은 무조건 equals
				run=false;
				System.out.println("프로그램 종료");
			}
		}
		
		
		
	}

}
//