package chepter04;

public class Example01 {

	public static void main(String[] args) {
		//ȸ�������� 0������ ȸ����ȣ�� �ο��� ������ ���� ū ȸ����ȣ�� ���̽ÿ�
		int max=0;
		int min=1000;
		int[] array= {1,6,9,2,35,178,234,4,5,11};
		
		/*�ִ밪 �˰���
		for (int i=0; i<array.length; i++) {
			if (max<array[i]) {
				max=array[i];
			}
			System.out.println("������ max ���� : " + max);
		}
		System.out.println("���� ū ���� : " + max);
		*/
		
		for (int i=0; i<array.length; i++) {
			if (min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("�ּҰ��� : " + min);
	}
}
