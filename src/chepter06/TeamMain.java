package chepter06;

public class TeamMain {

	public static void main(String[] args) {

		Team team1=new Team(); //��ü ����
		TeamMember t=new TeamMember();
		t.setTeamName("�� ����LED");
		System.out.println("���� : " + t.getTeamName());
		System.out.println("====================");
		team1.init();		//�ʱ�ȭ�޼���
		team1.Disp();		
		
		//----------------
		TeamMember tm=new TeamMember();
		tm.setName("�ڹ���");
		tm.setGender("����");
		tm.setmName("�̼�â");
		tm.setTeamName("�ڷᱸ��");
		tm.setMphone("010-9129-1123");
	}

}
