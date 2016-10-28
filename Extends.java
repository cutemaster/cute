package com.master.core;

public class Extends {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * 子类对象赋值给父类变量可以<br>
	 * 父类对象赋值给子类变量则需要强制类型转换，否编译出错
	 */
	public static void convert() {
		People people1, people2;
		President president1, president2;
		people1 = new People();
		president1 = new President();
		
		people2 = president1;
		//president2 = people1; //compile error
	}

}

class People {}

class President extends People {}