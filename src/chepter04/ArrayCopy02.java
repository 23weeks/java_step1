package chepter04;

public class ArrayCopy02 {
		
	public static void main(String[] args) {

		Book[] bookArray1=new Book[3];
		Book bookArray2[]=new Book[3];
		
		bookArray1[0]=new Book("빨간머리앤","몽고메리");
		bookArray1[1]=new Book("백설공주", "그림형제");
		bookArray1[2]=new Book("카산드라의 거울", "베르나르 베르베르");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);	//얕은복사
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			System.out.println();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		System.out.println("======원본변경========");
		System.out.println();
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
			System.out.println();
		}
		System.out.println("======복사본변경========"); //원본이 변경이되면 copy도 따라서 변경이 됨.
		System.out.println();
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			System.out.println();
		}
		
	}

}
