package Example;

import java.awt.print.PrinterException;
import java.util.Random;

public class Runners {

	public static void main(String[] args) {

		int[] playerRandom = new int[4];
		String[] playerJump = {"", "", "", ""};
		
		boolean finish = false;
		int finishPlayer = 0;
		
		while(true) {
			
			//����Ÿ�
			for(int i=0; i<playerRandom.length; i++) {
				playerRandom[i]=new Random().nextInt(3);	//0~3 => 4��
				
			}
				
			//Thread : 0.1�� �������� �޽�
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			//�� �������� ����Ÿ� ����
			for(int i=0; i<playerJump.length; i++) {
				
				switch(playerRandom[i]) {
				case 0:
					playerJump[i]+="";
					break;
				case 1:
					playerJump[i]+=" ";
					break;
				case 2:
					playerJump[i]+="  ";
					break;
				case 3:
					playerJump[i]+="   ";
					break;
					
				}//switch
			}//for
			
			//�޸���
			System.out.println("====================================================");
			for(int i=0; i<playerJump.length; i++) {
				//0�� �ƴϸ�
				System.out.print(playerJump[i]);
				System.out.println((i+1)+"��");
				
				if(playerJump[i].length() >= 50) {
					finishPlayer = i+1;
					finish = true;
				}
			}//for
			System.out.println("====================================================");
			//���
			if(finish) {
				System.out.println("winner - " + finishPlayer);
				break;
			}
		}
		
	}

}
