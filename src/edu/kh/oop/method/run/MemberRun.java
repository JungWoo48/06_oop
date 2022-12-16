package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {

	//[접근제한자] [예약어] 반환형 메서드명 ( [매개변수] ) 
	public static void main(String[] args) {
		MemberService service = new MemberService();
		//MemberServie의 기본 생성자가 작성되어 있지는 않지만
		//문제없이 사용 가능하다( 컴파일러 내부에 자동으로 생성)
		
		//    ---주의---
		//생성자가 하나라도 있다면 기본생성자 자동완성을 해주지 않는다
		service.displayMenu();
	}
	
	
}
