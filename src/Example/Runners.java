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
			
			//도약거리
			for(int i=0; i<playerRandom.length; i++) {
				playerRandom[i]=new Random().nextInt(3);	//0~3 => 4개
				
			}
				
			//Thread : 0.1초 간격으로 휴식
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			//각 선수에게 도약거리 적용
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
			
			//달리기
			System.out.println("====================================================");
			for(int i=0; i<playerJump.length; i++) {
				//0이 아니면
				System.out.print(playerJump[i]);
				System.out.println((i+1)+"옷");
				
				if(playerJump[i].length() >= 50) {
					finishPlayer = i+1;
					finish = true;
				}
			}//for
			System.out.println("====================================================");
			//결과
			if(finish) {
				System.out.println("winner - " + finishPlayer);
				break;
			}
		}
		
	}

}
