package chepter06;

import java.util.Scanner;

public class GugudantTableMain {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		GugudanTable dan=new GugudanTable();
		System.out.print("단을 입력하세요 : ");
		dan.showTable(scn.nextInt());
		
	}

}
