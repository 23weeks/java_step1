package chepter07;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {

		ThisTest R1 = new ThisTest();
		
		R1.Move();
		R1.Move();
		R1.RAge();
		System.out.println("");
		//======================
		int R_speed=Integer.parseInt(JOptionPane.showInputDialog("로봇속도"));
		int R_age=Integer.parseInt(JOptionPane.showInputDialog("로봇나이"));
		String R_name=JOptionPane.showInputDialog("로봇이름");
		String R_num=JOptionPane.showInputDialog("로봇번호");
		
		ThisTest R2=new ThisTest(R_speed, R_age, R_name, R_num);
		
		//출력
		System.out.println("속도 : " + R2.getSpeed());
		System.out.println("나이 : " + R2.getAge());
		System.out.println("이름 : " + R2.getRobotName());
		System.out.println("번호 : " + R2.getRobotNum());
		
		
	}

}
