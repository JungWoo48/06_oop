package com.kh.test.money.model.vo;

	public class Money {
	
		public static final String UNIT = "원";//
	
		private int money;
		
	public Money() {//기본생성자
		
	}
	
	public Money(int money) {//매개변수 생성자
		
		this.money = money;
	}

	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static String getUnit() {
		return UNIT;
	}

	public void print() {
		
	}
	
}
