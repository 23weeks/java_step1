package chepter05;

public class FunTest_Overload_Main {

	public static void main(String[] args) {

		//FunTest_Overloading의 객체를 생성한다
		FunTest_Overloading obj=new FunTest_Overloading();
		obj.getResult('A');
		obj.getResult(20);
		obj.getResult("한주간 고생 많으셨습니다");
		obj.getResult(6, "해피 6월");
	}

}
