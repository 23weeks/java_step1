package chepter04;

public class Example02 {

	public static void main(String[] args) {

		int[][] array= { {95,86},{83,92,96},{78,83,93,87,88} };
		int sum=0;
		double avg=0.0;
		int total=0;
		int count=0;
		
		
		//for ���� �̿��Ͽ� ������ �հ踦 ���Ͻÿ�.
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
			avg=(double)sum/array[i].length;
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + Math.round(avg));
			
			total+=sum;		//��ü ������ ���ϴ� �ڵ�
			sum=0;			//�ʱ�ȭ
			avg=0.0;		//�ʱ�ȭ
			
			System.out.println("---------------");
			}
		//���� �հ�� ���
		double totalavg=(double)total/count;
		System.out.println("������ : " + total);
		System.out.println(String.format("����� : %.2f", totalavg));
		
		
		
			/*
			for (int[] num : array) {
				sum = 0;
				for (int score : num) {
					sum += score;
					
				}
				count++;
				System.out.println(count + "�׷��� �л� ���� �հ�� : " + sum);
			}
			*/
		/*
		int sum[]=new int[3];	
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum[i]+=array[i][j];
			}
			System.out.println(sum[i]);
		}
	*/
	}

}
