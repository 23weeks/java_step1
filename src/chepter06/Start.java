package chepter06;

import java.util.Random;
//UP DOWN�� �̿��Ͽ� System�� ���� �ִ� ī���� ��ȣ�� ���߱�. ������ result=SUCCESS�� �Է��ϰ� 
//������� ������� ����Ѵ�.
public class Start {

	private int random=new Random().nextInt(50)+1;
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		//random������ mynumber�� ���� ������ UP / ũ�� DOWN / result="SUCCESS"
		
		count++;
		if (random > mynumber) {				//47
			System.out.println("UP!!");
		}else if (random < mynumber) {
			System.out.println("DOWN!!");
		}else {
			System.out.println(count + "�� ���� ����!!");
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
