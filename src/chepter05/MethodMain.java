package chepter05;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {

		//��ü ����
		Method bread=new Method();
		int x=5;
		String y="�Һ���";
		bread.makeBread();
		System.out.println("-----------------");
		bread.makeBread(x);
		System.out.println("-----------------");
		bread.makeBread(x, y);
		
	}

}
