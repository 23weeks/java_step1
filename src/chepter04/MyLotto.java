package chepter04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		//로또번호 6개를 담을 배열

		int[] lotto = new int[6];
		int num = 0;
		int cnt=0;
		System.out.println("< 이번 주 로또 예상번호 >");
		num=Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매 횟후를 입력하세요."));
		
		while (num < cnt) {
			System.out.print("["+(cnt+1)+"] ");
			out : for (int i = 0; i < lotto.length;) {
				lotto[i] = new Random().nextInt(45)+1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						continue out;
					}
				}
				System.out.print(lotto[i] + " ");
				i++;
			}
			cnt++;
			
			System.out.println();
		}
	}
}
