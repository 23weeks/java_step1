package chepter05;

public class FunTest08 {
	//재귀함수를 쓰는 이유 = for 문으로 만들면 여러줄이 생길걸 몇줄 줄여서 간결하게 확인이 가능해서.
	//필드 또는 멤버변수
	
	//디폴트 생성자 (눈에는 보이지 않음 = FunTest08)
	
	//메서드
	public static int Recur(int a) {
		
		int result;
		System.out.print(a + " ");
		
		if (a == 1) {
			return(1);	//return 1은 브레이크를 잡는것과 똑같음 : 정상종료는 아니지만 오류없이 중지하기 위한 코드
			
		}else result=a*Recur(a-1);
		
		return result;
		
		//return 0;		//정상 종료후 넘어갈 값이 없을을 알림 /return 값이 없을 때 0을 줌 (false)
		
	}
	
	
	public static void main(String[] args) {
		/*
		//static이 아닌 경우 객체를 생성하여 메서드 사용
		FunTest08 re=new FunTest08();
		re.Recur(5);
		*/
		int res;
		int x=5;
		System.out.println("여기는 main입니다");
		System.out.println("메서드 호출");
		res=Recur(x);
		System.out.println();
		System.out.println("함수(메서드) 호출 후 결과값");
		System.out.print("1 ~ " + x + "까지의 수를 곱한 값 : " + res);
		
	}

}
