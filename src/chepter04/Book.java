package chepter04;

public class Book {
	
	public String bookName;		//�������
	public String author;		//�������

	//����Ʈ ������ = �Ű������� ����
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	//������ �����ε� = �Ű������� �ٸ�)(���� Ÿ���� �߿� : string 2��)
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
	//����� ����
	public void showBookInfo() {
		System.out.println("å �̸� : " + bookName + " / ���� : " + author);
	}
}
