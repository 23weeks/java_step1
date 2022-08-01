package chepter06;

public class TeamMain {

	public static void main(String[] args) {

		Team team1=new Team(); //객체 생성
		TeamMember t=new TeamMember();
		t.setTeamName("조 명은LED");
		System.out.println("팀명 : " + t.getTeamName());
		System.out.println("====================");
		team1.init();		//초기화메서드
		team1.Disp();		
		
		//----------------
		TeamMember tm=new TeamMember();
		tm.setName("박미진");
		tm.setGender("여자");
		tm.setmName("이세창");
		tm.setTeamName("자료구조");
		tm.setMphone("010-9129-1123");
	}

}
