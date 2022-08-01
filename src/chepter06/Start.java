package chepter06;

import java.util.Random;
//UP DOWN을 이용하여 System이 갖고 있는 카드의 번호를 맞추기. 성공시 result=SUCCESS를 입력하고 
//몇번만에 맞췄는지 출력한다.
public class Start {

	private int random=new Random().nextInt(50)+1;
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		//random값보다 mynumber의 값이 작으면 UP / 크면 DOWN / result="SUCCESS"
		
		count++;
		if (random > mynumber) {				//47
			System.out.println("UP!!");
		}else if (random < mynumber) {
			System.out.println("DOWN!!");
		}else {
			System.out.println(count + "번 만에 정답!!");
			result="SUCCESS";
		}
		
		return result;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
