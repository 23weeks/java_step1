package chepter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.print("�������� ���� �Է����ּ��� : ");
		int n=scn.nextInt();
		
		Guide guide=new Guide(n);
		
		System.out.println("������ ���");
		for (int i=0; i<n; i++) {
			System.out.print((i+1)+". �̸� : ");
			String name=scn.next();
			guide.guest[i].setName(name);
		
			
			System.out.print((i+1)+". ���� : ");
			String gender=scn.next();
			guide.guest[i].setGender(gender);
			System.out.println("-------------");
		}//for
		
		boolean run = true;
		
		while(run) {
			System.out.println("======================================");
			System.out.println("| 1. ������ ���� | 2. ������ ���� | 3. ���� |");
			System.out.println("======================================");
			int num=scn.nextInt();
			if (num == 1) {
				
				for (int i=0; i<n; i++) {
				System.out.println("�̸� : " + guide.guest[i].getName());
				System.out.println("���� : " + guide.guest[i].getGender());
				System.out.println("������ : " + Guide.point);
				System.out.println("-------------");
				}//for
				
			}else if(num == 2){
				System.out.print("�������� ���� �����Ͻðڽ��ϱ�? : ");
				Guide.point=scn.next();
				System.out.println(Guide.point + "�� ����Ǿ����ϴ�.");
			}else {
				System.out.println("���Ḧ �����ϼ̽��ϴ�.");
				run=false;
			}
			
		}//while
	}//main
}//class

	
