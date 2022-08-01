package chepter05;

import javax.swing.JOptionPane;

public class FunTest01 {

	public static void main(String[] args) {

		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("a값"));
		b=Integer.parseInt(JOptionPane.showInputDialog("b값"));
		
		sum(a,b);
		
	}

	//합계 매서드(함수) ============ C언어랑 파이썬과는 다르게 꼭 위에만 있어야하는건 아님! (Java는 상관 ㄴ)
	//메인을 기준으로 하여 메인 선언 전 또는 후에 정의해도 됨
	public static void sum(int a, int b) {
		int total=a+b;
		System.out.println("두 수의 합 : " + total);
		
	}
	
}
