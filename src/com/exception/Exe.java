package com.exception;

public class Exe {
private static void throwmethod() throws Exception {

		
		int age=12;
		if (age>=18) {
			System.out.println("eligible");
		}else {
		
			throw new Myexception();
			
		}
		
	}
public static void main(String[] args) throws Exception {
	throwmethod();
}

}
