package chepter04;

public class CharArray02 {

	public static void main(String[] args) {

		char[] alpahabets=new char[26];
		char ch='A';
		
		for (int i=0; i< alpahabets.length; i++, ch++) {
			
			alpahabets[i] = ch;
			
			System.out.print("(" + alpahabets[i] + "," + (int)(alpahabets[i]) + ")" + " ");
			
		}
		
	}

}
