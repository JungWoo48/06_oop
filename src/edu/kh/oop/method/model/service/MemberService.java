package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { //클래스
	//속성(필드)
	//Encapsulation 원칙에 의해 private 접근자를 사용해야하낟
	//필드에 변수를 하나 작성하면, 클래스 안에서 어디서든 사용가능
	private Scanner sc = new Scanner(System.in);
							//System.in : 자바에서 기본적으로 지정해둔 입력장치(키보드)
	
	private Member memberInfo = null;//가입한 회원의 정보를 저장할 변수
	private Member loginMember = null;//로그인한 회원의 정보를 저장할 변수
	
	//가눙(생성자, 메서드)
	// ***여러기능을 하나의 메소드에 작성하지 말것
	// 되도록 하나의 기능만 수행하도록 작성한다
	//메소드는 메소드당 하나의 기능만 가지고 있는게 좋다
	//----기능별로 세분화를 해야 기능뱔로 호출하여 쓸수 있다.
	//public void today() {
		//1. 밥먹기
		//2. 일하기
	//}
	//public void eat() {}
	//public void work() {}
	//두가지 메소드를 나누어서 만들고
	//ear(); work();를 하나씩 불러서 쓸수있게한다
	
	
	// *** 메서드 작성법 ****
	
	// [접근제한자 ]  		[예약어]  	  반환형 				메소드명( [매개변수] ) {}
	//  public			static		기본자료형
	//  protected		final		참조형(배열, 클래스)
	//  (default)		abstract	void
	//  private		 static final	
	
	
	// ** 반환형 void **
	// 반환(return) : 메서드 수행후 호출부로 돌아가는 것
	// 반환 값 : 메서드가 돌아가면서 가져갈 값
	// 반환 형 : 반환 값의 자료형
	// ->void(텅빈) : 돌려보낼 값이 void(텅빈)이라는 뜻
	
	//메뉴화면 출력 기능
	public void displayMenu() {
		//일은 하는데 결과값은 없다
		int menuNum = 0;//지역변수
		
		do { //무조건 한번은 반복한다
			System.out.println("============");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 >>>");
			menuNum = sc.nextInt(); // 필드에 저장된 Scanner sc 사용
			sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거
			
			switch(menuNum) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 0 : break;
			default : System.out.println("입력 오류");
				
			}
		
		}while(menuNum != 0);// 반복 종료
	}
	//회원 가입 기능
	public String singUp( ) { 
		System.out.println("******* 회원 가입 *******");
		
		System.out.print("아이디: ");
		String memberId = sc.next(); // lowe
		
		System.out.println("비밀번호: ");
		String memberPw = sc.next();
		
		System.out.println("비밀번호 확인: ");
		String memberPw2 = sc.next();
		
		System.out.println("이름: ");
		String memberName = sc.next();
		
		System.out.println("나이: ");
		int memberAge = sc.nextInt();
		
		//비밀번호, 비밀번호 확인 이 일치해야 회원가입 성공
		//일치하지 않으면 실패
		if( memberPw.equals(memberPw2)) {//일치하는 경우
			memberInfo = new Member(memberId, memberPw, memberName, memberAge );
			return "회원 가입 성공";
		
		
		} else {
			return "회원 가입 실패(불일치)";
		}
			
		
		
	}
	
	//로그인 기능
	public String login() {
		System.out.println("****로그인****");
		return null;
		
		//회원가입 여부 확인 == memberInfo가 객체를 참고하고있는지 확인
		if(memberInfo == null) {//회원가입을 안한경우
			return "회원가입 먼저 진핼";
		}
		
		System.out.print("아이디 입력: ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 입력: ");
		String memberPw = sc.next();
		
		if(memberId.equals(memberInfo.getMemberId()) &&
			memberPw.equals(memberInfo.getMemberPw()) ) {
				
			loginMember = memberInfo;
			
			
			return loginMember.getMemberName() +"환녕합니다";
		} else {
			return "아이디 또는 비밀번호가 일치하지 않습니다";
		}
		
	}
	//회원 정보 조회 기능
	//회원 정보 수정 기능
	
	
	
	
}
