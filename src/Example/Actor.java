package Example;

import java.util.Scanner;

public class Actor {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		String[][] actor = { {"[송강호]", "박쥐", "괴물", "관상"},
							{"[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게"},
							{"[이병헌]", "지아이조", "레드", "광해"}};
		
		int count=0;
		System.out.print("검색할 배우 : ");
		String name = scn.next();
		for (int i=0; i<actor.length; i++) {
				if (actor[i][0].equals("["+name+"]")) {
					for (int j=0; j<actor[i].length; j++) {
					System.out.println(actor[i][j]);
					count++;
					}
				}
			
		}//for
	if ((count==0)){
		System.out.println("해당 배우가 존재하지 않습니다.");
	}
	}//main

}

