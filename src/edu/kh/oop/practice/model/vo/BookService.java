package edu.kh.oop.practice.model.vo;

public class BookService {
	
	public void practice() {
	
		
		Book b1 = new Book();//1) 기본생성자를 이용하여 첫번째 Book 객체 생성
		
		System.out.println(b1.toString());
		
		Book b2 = new Book(); //2) 매개변수 생성자를 이용하여 두번쨰 Book 객체 생성
		
		b2.setTitle("자바의 정석");
		b2.setPrice(30000);
		b2.setDiscountRate(0.2);
		b2.setAuthor("남궁성");
		
		System.out.println(b2.toString());//3)객체가 가진 필드 값을 toString으로 출력
		
	
		
		System.out.println("============================");
		System.out.println("수정된 결과 확인 ");
		
		Book b3 = new Book();//4) 첫번쨰 객채가 가진 값을 stter 를 이용하여 출력
		
		b3.setTitle("c언어");
		b3.setPrice(30000);
		b3.setDiscountRate(0.1);
		b3.setAuthor("홍길동");
		
		System.out.println(b3.toString());//5) 수정된 객체의 필드값을 toString으로 출력
		
		System.out.println("============================");
		
		double sum = b3.getPrice() - b3.getPrice() * b3.getDiscountRate();//6)할인값 계산
		double sum2 = b2.getPrice() - b2.getPrice() * b2.getDiscountRate();
		
		
		System.out.println("도서명 = " + b3.getTitle());//7) 각 개체의 할인율을 적용한 할인값 출력
		System.out.println("할인된 가격 = " +(int)sum + "원");
		System.out.println("도서명 = " + b2.getTitle());
		System.out.println("할인된 가격 = " +(int)sum2 + "원");
		
	}

}
