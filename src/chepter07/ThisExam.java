package chepter07;

public class ThisExam {

	int day;
	int month;
	int year;
	
	public ThisExam() {}
	
	public ThisExam(int day, int month, int year) {
		
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	//===========================
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		//���1
		ThisExam Bd1 = new ThisExam(5,7,1995);
		System.out.println(Bd1.year + "�� " + Bd1.month + "�� " + Bd1.day + "��");
		
		//���2
		ThisExam Bd2 = new ThisExam();
		Bd2.setDay(5);
		Bd2.setMonth(7);
		Bd2.setYear(1995);
		//Bd2.printThis();
		System.out.println();
		System.out.println(Bd2.year + "�� " + Bd2.month + "�� " + Bd2.day + "��");
		
		
		
		
		
		
	}

}
