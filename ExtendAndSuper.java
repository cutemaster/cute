package com.master.core;

import java.util.ArrayList;
import java.util.List;

public class ExtendAndSuper {

	public static void main(String[] args) {
		
	}
	
	public static void testExtends() {
		List<? extends Fruit> list = new ArrayList<>();
		list.add(null);
		//list.add(new Food()); //compile error
		//list.add(new Fruit());  //compile error
		//list.add(new Apple()); //compile error
		Food food = list.get(0);
		Fruit fruit = list.get(0);
		//Apple apple = list.get(0); //compile error
	}
	
	public static void testSuper() {
		List<? super Fruit> list = new ArrayList<>();
		list.add(null);
		//list.add(new Food()); //compile error
		list.add(new Fruit());
		list.add(new Apple());
		
		//Food food = list.get(0); //compile error
		//Fruit fruit = list.get(0); //compile error
		//Apple apple = list.get(0); //compile error
	}
	
	
}

class Food {}

class Fruit extends Food {}

class Apple extends Fruit {}