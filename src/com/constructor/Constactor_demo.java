package com.constructor;

public class Constactor_demo {
	public void sample() {
		System.out.println("sample");
	}

	public Constactor_demo() {
		System.out.println("default parameter");
	}

	public Constactor_demo(int a) {
		System.out.println("default parameter");
	}

	public Constactor_demo(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
//		object create constructor automatically executed the object
//		class name constructor name will be same to create the constructor
		Constactor_demo demo1 = new Constactor_demo();
		demo1.sample();
		Constactor_demo demo2 = new Constactor_demo(12);
		Constactor_demo demo3 = new Constactor_demo(11, 12);

	}

}
