package chepter06;


public class TakeTrans {

	public static void main(String[] args) {

		//�л�2���� ��ü�� ����
		StdInfo student1=new StdInfo("��ٺ�", 10000);
		StdInfo student2=new StdInfo("���ܺ�", 12000);
		StdInfo student3=new StdInfo("�迹��", 15000);
		StdInfo student4=new StdInfo("�̼�â", 13000);
	
		//����Ÿ��
		Bus bus100=new Bus(100);
		Bus bus200=new Bus(200);
		Bus bus300=new Bus(300);
		
		student1.takeBus(bus100);
		student2.takeBus(bus200);
		student3.takeBus(bus300);
		student4.takeBus(bus300);
		
		
		//����öŸ��
		Subway subway1=new Subway("1ȣ��");
		Subway subway3=new Subway("3ȣ��");
		Subway subway7=new Subway("7ȣ��");
		
		student1.takeSubway(subway1);
		student2.takeSubway(subway3);
		student3.takeSubway(subway3);
		student4.takeSubway(subway7);
		
		
		//�л�����
		student1.showInfo();
		System.out.println("================================");
		student2.showInfo();
		System.out.println("================================");
		student3.showInfo();
		System.out.println("================================");
		student4.showInfo();
		System.out.println("================================");
		
		//��������
		bus100.showInfo();
		System.out.println("================================");
		bus200.showInfo();
		System.out.println("================================");
		bus300.showInfo();
		System.out.println("================================");
		
		//����ö����
		subway1.showInfo();
		System.out.println("================================");
		subway3.showInfo();
		System.out.println("================================");
		subway7.showInfo();
	}

}
