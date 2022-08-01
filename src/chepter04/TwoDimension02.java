package chepter04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {

		int[][] JavaScore = new int[2][3];
		
		for (int i=0; i<JavaScore.length; i++) {
			for(int j=0; j<JavaScore[i].length; j++) {
				int jumsu=Integer.parseInt(JOptionPane.showInputDialog("Á¡¼ö"));
				JavaScore[i][j]=jumsu;
				System.out.println("JavaScore[" + i + "][" + j +"] = " + JavaScore[i][j]);
			}
			System.out.println();
		}
		
	}

}
