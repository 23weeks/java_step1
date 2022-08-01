package chepter06;

import java.util.Scanner;

public class Venmain {
	
	

	public static void main(String[] args) {
		
		int money=0;
		String select="";
		
		Vending ven=new Vending();		//객체 생성
		ven.Init();	//음료준비
		
		System.out.print("돈을 투입하세요 : ");
		Scanner scn=new Scanner(System.in);
		money=scn.nextInt();
		ven.showCans(money);
		
		System.out.print("음료를 선택하세요 : ");
		select=scn.next();
		ven.OutCan(select);
		
	}

}
