package Example;

import java.util.Scanner;

public class Actor2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int count = 0;
		
		String[][] actor2 = {	{"[송강호]", "박쥐", "괴물", "관상"},
								{"[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게"},
								{"[이병헌]", "지아이조", "레드", "광해"}};

		System.out.print("검색할 배우 : ");
		String name = scn.next();
		
		for (int i = 0; i<actor2.length; i++) {
			
			if (actor2[i][0].equals("[" + name + "]")){
				for(int j=0; j<actor2[i].length; j++) {
					System.out.println(actor2[i][j]);
					count++;
				}
			}
		}if (count == 0) {
			System.out.println("해당 배우가 존재하지 않습니다.");
		}
	}

}
