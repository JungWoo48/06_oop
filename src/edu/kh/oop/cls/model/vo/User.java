package edu.kh.oop.cls.model.vo;

public class User {
	// 필드
	// == 속석
	
	// 아이디, 비밀번호, 나이, 성별 ,이름--추상화 진행
	private String userId; 
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
	// 생성자
	// 기본 생성자
	public User() {
		//기능 
		 System.out.println("기본 생성자로 User 객체 생성");
		
		//필드 초기화 진행 
		userId = "user01";
		userPw = "1234";
		userName = "jj";
		userAge = 20;
		userGender = 'm';
		
	}
	//매개변수 생성자
	// ****사용되는 기술, 변수 : 매개변수, overloading, this
	
	//****매개변수 : 생성자나 메서드 호출시 () 안에 작성되어
	//				전달되어지는 값을 저장하는 변수
	// -> 	전달받은 값을 저장하고 있는 매개체(지니고있는) 역할의 변수
	
	public User( String userid, String userPw ) {//u3에서 매개변수 를받아 위에 있는 초기값을 대체한다
		this.userId = userId;
		this.userPw = userPw;
		
	}	
	
	
	
	// 메소드
	// 캡슐화로 인한 간접 접근기능 생성(getter/ setter)
	// alt + shift + s getter setter - generate getter/setter 생성 단축키
	public String getUserId() {//userId의 getter
		return userId;
	}
	
	public void setUserId(String userId) { // userId의 setter
	this.userId = userId;
	}
	
	public String getUserPw() {//userPw의 getter
		return userPw;
	}
	
	public void setUserPw(String userPw) {// userPw의 setter
		this.userPw = userPw;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public char getUserGender() {
		return userGender;
	}

	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
}
