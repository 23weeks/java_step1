package chepter08;

public class Guide {

	static String point;
	Guest[] guest;	//선언
	
	//오버로딩 생성자
	public Guide(int n) {
		point="하와이";
		guest=new Guest[n];		//배열의 갯수
	
	for(int i=0; i<guest.length; i++) {
		guest[i]=new Guest();
	}
	}
}
