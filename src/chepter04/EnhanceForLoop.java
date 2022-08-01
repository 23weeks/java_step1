package chepter04;

public class EnhanceForLoop {

	public static void main(String[] args) {

		String[] strArray= {"Java", "Oracle", "JSP", "Html5,CSS,JS,JQ", "Spring", "PythonCamp"};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("==================");
		// 확장 for 
		for(String lang:strArray) {				//많이 사용하는 메써드 - 타입을 맞춰주는게 중요
			System.out.println(lang);			// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		}
		
	}

}
