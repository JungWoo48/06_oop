package edu.kh.oop.cls.model.vo;

public class Student { // 클래스 선언부
// [접근제한자] [예약어] class 클래스명

// 접근 제한자 public : 같은 프로젝트 내에서 어떤 클래스 에서든 import 할 수 있음을 나타냄.	


	// 필드(field) : 객체의 속성을 작성ㅎ사는 클래스 내부영역
	// == 멤버 변수 : 메서드 밖에 작성된 변수
	// 		1)인스턴스 변수 : 필드에 작성되는 일반변수(객체 미생성시 사용불가)
	//		2) 클래스 변수(== static 변수) : 필드에 static 예약어가 작성된 변수(객체 생성 안해도 쓸수 있다)
	
	/*/ 필드 구성
	 * 
	 * [접근제한자] 	|	[예약어] 		 |	자료형 	변수명 	[초기값]; // 대괄호는 선택하상
	 *              |				 |
	 * + public		|	final		 |	기본자료형
	 * # protected	|	static		 |	배열
	 * ~ (default)	|	final static |	클래스명
	 * - private	|	static final | (참조명)
	 * 
	 * 
	 */
	
	// 필드의 접근제한자는 : 직접 접근 가능한 범위를 나타낸다
	
	public int v1 = 10;
	protected int v2 =20;
	int v3 = 30; //(default)
	//특별한 경우를 제외하고는 private를 사용한다
	private int v4 = 40;
	
	public void ex() {
		System.out.println("같은 클래스 내부 직접 접근");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		
	}
	
	//=============================================
	
	//static 예역어
	
	public static String schoolname = "kh정보교육원";
	
	private String name; // 캡슐화 원칙에 의거 private로 만든다 -> 간접 접근법이 필요
	
	{
		//초기화 블록 : 객체 생성시 필드 값 초기화
		name = "홍";
	}
	
	// private에는 getter / setter 문을 이용한 접근이 필요하다
	public String getname() {
		return name;
	}
	public void setname(String name/*매개변수와 변수명이 들어가야함*/) {//setname안에 있는 것을 전달
		this.name = name; //받아온 매개변수를 위 private에 대입하는것
	}
	
	

	// 생성자
	// 메소드


}
