package chepter05;

import java.util.Scanner;

public class Method {

	//�ʵ� �Ǵ� �������
	
	//����Ʈ ������(��������)
	
	//�����ε� : �޼����� �̸��� ������ �Ű��������� �ٸ�
	void makeBread() {
		System.out.println("���� ����ϴ�.");
	}//method1
	
	void makeBread(int count) {		//5
		
		for(int i=0; i<count; i++) {		//0,5
			System.out.println((i+1) + "��° ���� ����������ϴ�.");		//1
		}
		
		System.out.println("��û�Ͻ� " + count + "���� ���� ��� �غ�Ǿ����ϴ�.");	//5
	}//method2
	
	void makeBread(int count, String name) {
		for(int i=0; i<count; i++) {
		System.out.println((i+1) + "��° " + name + " ���� ����������ϴ�.");
	}
		System.out.println("��û�Ͻ� " + count + "���� " + name + "���� ��� �غ�Ǿ����ϴ�.");
	}//method3


	void order(){
		
		Method bread=new Method();
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. �� ���� ���� | 2. ���� ������ ���� | 3. ����");
			System.out.print("����> ");
			int input_num=scan.nextInt();
			
			if (input_num == 1) {
				System.out.print("���� : ");
				int cnt=scan.nextInt();
				bread.makeBread(cnt);
			}else if (input_num == 2) {
				System.out.print("���� ���� : ");
				String a=scan.next();		//�� nextLine�� �ƴұ� > ���� �ٿ� enter(����)�� ����鼭 ���� �Է°��� �ȵ� >>�׷��� next�� ����ϴ°� ��õ
				System.out.print("���� ���� : ");
				int cnt=scan.nextInt();
				bread.makeBread(cnt, a);
			}else {
				
				break;
			}//else
		}//while
	}//order
}//class
