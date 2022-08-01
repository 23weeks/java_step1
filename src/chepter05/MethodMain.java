package chepter05;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {

		//按眉 积己
		Method bread=new Method();
		int x=5;
		String y="家焊风";
		bread.makeBread();
		System.out.println("-----------------");
		bread.makeBread(x);
		System.out.println("-----------------");
		bread.makeBread(x, y);
		
	}

}
