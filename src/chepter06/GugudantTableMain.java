package chepter06;

import java.util.Scanner;

public class GugudantTableMain {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		GugudanTable dan=new GugudanTable();
		System.out.print("���� �Է��ϼ��� : ");
		dan.showTable(scn.nextInt());
		
	}

}
