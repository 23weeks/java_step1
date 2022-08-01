package chepter05;

import java.util.Scanner;

public class FunTest07 {

	public FunTest07() {
	}
	//return값이 있는 경우
	/*
	public static String Edustep(int Edu) {
		Scanner scn=new Scanner(System.in);
		String step;
	
		//1->1단계 2->2단계 3->3단계 그 외 입력된 스터디가 없습니다.
		if (Edu == 1) {
			step="1단계";
			
		}else if (Edu == 2) {
			step="2단계";
			
		}else if (Edu == 3) {
			step="3단계";
			
		}else
			step="스터디단계가 없습니다";
			return step;
	}
	*/
	//return값이 없는 경우
	public static void Edustep(int Edu) {
		
		if (Edu == 1) {
			System.out.println("현재 스터디 단계는 step1 입니다");
		}else if (Edu == 2) {
			System.out.println("현재 스터디 단계는 step" + Edu + " 입니다");
		}else if (Edu == 3) {
			System.out.println("현재 스터디 단계는 step" + Edu + " 입니다");			
		}else
			System.out.println("해당하는 스터디 단계가 없습니다");
	}
	

	
	public static void main(String[] args) {		//void = 비어있는, return값이 없다는 뜻
		
		Scanner scn=new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요 : ");
		int num=scn.nextInt();
		//return 값이 있는 경우 매서드 호출하는 법
		//System.out.println("현재 수업 단계는 : " + Edustep(num) + " 입니다");
		
		//return 값이 없는 경우 매서드 호출하는 법
		Edustep(num);
	}

}
