package chepter08;

import javax.swing.JOptionPane;

public class FinalTest {
	//전역 멤버변수
	private static final int MAX=3;
	//final 로 고정시키면 수정이 불가함
	
	
	
	public static void main(String[] args) {
		//지역변수
		int num=0;
		
		for(int i=0; i<MAX; i++) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("값을 입력하쇼"));
			
			if(num>MAX) {
				System.out.println("입력값이 3보다 큽니다.");
			}else
				System.out.println("입력값이 3보다 크지 않습니다.");
		}
		
	}

}
