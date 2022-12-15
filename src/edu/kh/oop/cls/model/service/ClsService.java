package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;

public class ClsService {
	//클래스 접근 제한자 확인하기
	public void ex1() {
		Student std = new Student();
		// public class인 student는 패키지가 달라도 import가 가능하다
		
		//TestVo test = new TestVo();
		//default 클래스인 TestVo는 패키지가 달라서 import가 불가능 하다
		
		System.out.println(std.v1);
		//패키지가 다르지만 public이기 때문에 출력이 가능하다
	}
	public void ex2() {
		//static 필드 확인 예제
		
		Student std1 = new Student();
		Student std2 = new Student();
		//학생 개체 2개 생성
		
		System.out.println(std1.schoolname);
		//public이기 때문에 직접 접근 가능 (.을 찍는것이 직접접근)
		
		System.out.println("변경 전 : " + std1.getname());
		std1.setname("조");//매개변수에 이 값을 대입한다
		System.out.println("변경후 : " + std1.getname());
		
		System.out.println(std2.schoolname);
		//역시 public이라 가능
		System.out.println("변경전 : " + std1.schoolname);
		std1.schoolname = "정보원";//public이라 getter setter를 거치지 않아도 접근가능
		System.out.println("변경후 : " + std1.schoolname);
		
		//schoolname에 노란줄이 쳐지는 이유 -> 오류가 날정도는 아니지만 작성이 바르지 못해서
		
		//static이 붙은 필드(변수)는 
		//클래스면.뱐수명으로 사요해야한다

		Student.schoolname = "kh";
		System.out.println("Student.schoolname: " + Student.schoolname);
	
		/*/ static
		 * 
		 * 1) 공유 메모리 영역(또는 정적 메모리 영역)이라고 한다
		 * -> 프로그램 시작 시 static이 붙은 코드들이
		 * 모두 static 영역에 생성되고
		 * 프로그램이 종료될때 까지 사라지지않는다(정적)
		 * 그리고 static 영역에 생성된 변수는 어디서든 공유가 가능하다(공유)
		 * 
		 * 2) 사용법 : 클래스명.변수명
		 * 
		 */
		
		
	}

}
