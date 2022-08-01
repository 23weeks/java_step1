package chepter06;

public class Team {

	//필드 멤버변수
	
	public TeamMember member[]=new TeamMember[6];	//팀원

	//기본 생성자
	
	//초기화 메서드
	public void init() {
		member[0]=new TeamMember("이상주", "남자");
		member[1]=new TeamMember("장다빈", "여자");
		member[2]=new TeamMember("조현지", "여자");
		member[3]=new TeamMember("정단비", "여자");
		member[4]=new TeamMember("이도일", "남자");
		member[5]=new TeamMember("전선민", "남자");	
	}
	
	//출력 메서드
	public void Disp() {
		for(int i=0; i<member.length;i++){
			System.out.println("성명 : " + member[i].getName() +", 성별 : "+ member[i].getGender());
			System.out.println("=====================");
		}
	}
	
	
	
	
	
}
