package chepter04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		//�ζǹ�ȣ 6���� ���� �迭

		int[] lotto = new int[6];
		int num = 0;
		int cnt=0;
		System.out.println("< �̹� �� �ζ� �����ȣ >");
		num=Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ���� Ƚ�ĸ� �Է��ϼ���."));
		
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
