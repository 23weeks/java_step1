package chepter04;

public class Book {
	
	public String bookName;		//멤버변수
	public String author;		//멤버변수

	//디폴트 생성자 = 매개변수가 없음
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	//생성자 오버로딩 = 매개변수가 다름)(안의 타입이 중요 : string 2개)
	public Book(String bookName,String author){
		this.bookName=bookName;
		this.author=author;
		
	}
	
	//===========================================

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//사용자 정의
	public void showBookInfo() {
		System.out.println("책 이름 : " + bookName + " / 저자 : " + author);
	}
}
