package edu.kh.oop.cls.model.vo;

public class User {
	// 필드
	// == 속성
	
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
	
	public User( String userId, String userPw, String userName, int userAge, char userGender) {//u3에서 매개변수 를받아 위에 있는 초기값을 대체한다
		
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		//필드를 전부 초기화하는 목적의 매개변수 생성자
		//this(userId, userPw, userName, userAge, userGender); 로 사용가능
		//--같은 클래스의 다른 생성자를 호출할떄 사용한다
		//this위에는 더떤 다른 코드를 적어서는 안된다. == 항상첫줄
		//가독성의 문제로 잘 사용하지는 않는다
		
		
		// this는 매개 변수로 전달받은 값을 필드에 초기화한다
		
		
		//******this 참조변수 *****
		// -객체가 자기 자신을 참조할수 있도록 하는 변수
		// -모든 객체 내부에 숨겨져있다.
		// -필드명과 매개변수명이 같을경우 사용한다.
		// -이름을 구분하기위해서 주로 사용
		
		
	}
	// ***자바***
	// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복을 허용하지 않는다
	
	// ****오버로딩(Over Loading)****
	// - 클래스 내에 동일한 이름의 메서드(생성자도 포함)를 여러개 작성하는 기법
	// -> 하나의 이름으로 여러 기능을 수행할수 있게 한다
	
	//[오버로딩 조건]
	//1) 메서드 (생성자 포함)의 이름이 동일
	//2) 매개변수의 개수, 타입, 순서중 1개라도 달라야한다.
	
	//public User () {} -- 기본 생성자가 이미 작성되어 있어 중복으로 인식한다
	
	public User(String userid) {} // 매개변수의 개수 같은 생성자가 아뵤어서 오버로딩 가능
	
	public User(int userAge) {} // 매개변수의 개수는 같지만 타입이 다르다
	
	public User(String userId, int userAge) {} //수가 같은것이 위에 있으나 매개변수의 타입이 다르다
	
	public User(int userAge, String userId) {} // 수와 타입이 같으나 순서가 다르다
	
	//public User(int userAge, String userName) {} // 개수 순서 타입 모두 같아서 오버로딩 불가
												// 변수명은 신경쓰지 않기때문에 id와 name을 같은거로 인식
	
	
	
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
