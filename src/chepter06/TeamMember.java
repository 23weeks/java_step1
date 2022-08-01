package chepter06;

public class TeamMember {
	//멤버변수
	
	public String teamName;	//팀명
	public String mName;	//팀장이름
	public String mphone;	//팀장전화번호
	private String name;		//팀원이름
	private String gender;	//팀원성별
	//기본 생성자
	public TeamMember() {
		
	}
	
	//오버로딩 생성자(생성자 초기화)
	public TeamMember (String name, String gender) {
		this.name=name;
		this.gender=gender;
	}
//=========================================
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	
}
