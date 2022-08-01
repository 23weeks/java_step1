package chepter05;

import java.util.Scanner;

public class Method {

	//필드 또는 멤버변수
	
	//디폴트 생성자(생략가능)
	
	//오버로딩 : 메서드의 이름은 같지만 매개변수값이 다름
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}//method1
	
	void makeBread(int count) {		//5
		
		for(int i=0; i<count; i++) {		//0,5
			System.out.println((i+1) + "번째 빵이 만들어졌습니다.");		//1
		}
		
		System.out.println("요청하신 " + count + "개의 빵이 모두 준비되었습니다.");	//5
	}//method2
	
	void makeBread(int count, String name) {
		for(int i=0; i<count; i++) {
		System.out.println((i+1) + "번째 " + name + " 빵이 만들어졌습니다.");
	}
		System.out.println("요청하신 " + count + "개의 " + name + "빵이 모두 준비되었습니다.");
	}//method3


	void order(){
		
		Method bread=new Method();
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료");
			System.out.print("선택> ");
			int input_num=scan.nextInt();
			
			if (input_num == 1) {
				System.out.print("갯수 : ");
				int cnt=scan.nextInt();
				bread.makeBread(cnt);
			}else if (input_num == 2) {
				System.out.print("빵의 종류 : ");
				String a=scan.next();		//왜 nextLine이 아닐까 > 다음 줄에 enter(공백)이 생기면서 다음 입력값이 안들어감 >>그래서 next를 사용하는걸 추천
				System.out.print("빵의 갯수 : ");
				int cnt=scan.nextInt();
				bread.makeBread(cnt, a);
			}else {
				
				break;
			}//else
		}//while
	}//order
}//class
