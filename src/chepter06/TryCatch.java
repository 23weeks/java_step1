package chepter06;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {

		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		/*
		int result=num1/num2;
		System.out.println(result);
		*/
		try {
			
			int result=num1/num2;
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("num2에 숫자 0을 입력하시면 안됩니다");	//에러시에 수행문
		}
		System.out.println("프로그램 종료");
		
	}

}
