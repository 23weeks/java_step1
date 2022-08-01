package chepter04;

public class Example02 {

	public static void main(String[] args) {

		int[][] array= { {95,86},{83,92,96},{78,83,93,87,88} };
		int sum=0;
		double avg=0.0;
		int total=0;
		int count=0;
		
		
		//for 문을 이용하여 각각의 합계를 구하시오.
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
			avg=(double)sum/array[i].length;
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + Math.round(avg));
			
			total+=sum;		//전체 총점을 구하는 코드
			sum=0;			//초기화
			avg=0.0;		//초기화
			
			System.out.println("---------------");
			}
		//최종 합계와 평균
		double totalavg=(double)total/count;
		System.out.println("총점은 : " + total);
		System.out.println(String.format("평균은 : %.2f", totalavg));
		
		
		
			/*
			for (int[] num : array) {
				sum = 0;
				for (int score : num) {
					sum += score;
					
				}
				count++;
				System.out.println(count + "그룹의 학생 점수 합계는 : " + sum);
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
