package chepter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.print("관광객의 수를 입력해주세요 : ");
		int n=scn.nextInt();
		
		Guide guide=new Guide(n);
		
		System.out.println("관광객 등록");
		for (int i=0; i<n; i++) {
			System.out.print((i+1)+". 이름 : ");
			String name=scn.next();
			guide.guest[i].setName(name);
		
			
			System.out.print((i+1)+". 성별 : ");
			String gender=scn.next();
			guide.guest[i].setGender(gender);
			System.out.println("-------------");
		}//for
		
		boolean run = true;
		
		while(run) {
			System.out.println("======================================");
			System.out.println("| 1. 관광객 정보 | 2. 목적지 변경 | 3. 종료 |");
			System.out.println("======================================");
			int num=scn.nextInt();
			if (num == 1) {
				
				for (int i=0; i<n; i++) {
				System.out.println("이름 : " + guide.guest[i].getName());
				System.out.println("성별 : " + guide.guest[i].getGender());
				System.out.println("목적지 : " + Guide.point);
				System.out.println("-------------");
				}//for
				
			}else if(num == 2){
				System.out.print("목적지를 어디로 변경하시겠습니까? : ");
				Guide.point=scn.next();
				System.out.println(Guide.point + "로 변경되었습니다.");
			}else {
				System.out.println("종료를 선택하셨습니다.");
				run=false;
			}
			
		}//while
	}//main
}//class

	
