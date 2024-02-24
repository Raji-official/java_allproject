package string_pac;

import java.util.Scanner;

public class String_demo {
public static void main(String[] args) {
	String str="tester";
	String s="TESter";
	
	String book="Superman: Action Comics Vol. 2: Bulletproof (The New 52) : Morrison, Grant, Morales, Rags, Various: Amazon.in: Books";
	
	String substring2 = book.substring(0, 56);
	System.out.println(substring2);
	
	int length = str.length();
	System.out.println(length);
	
//	this is case sensitive
	
	boolean equals = str.equals(s);
	System.out.println(equals);
	
	
//	not declared case sensitive
	  boolean equalsIgnoreCase = str.equalsIgnoreCase(s);
	System.out.println(equalsIgnoreCase);
	
	
	String upperCase = str.toUpperCase();
	System.out.println(upperCase);
	
	String tolowerCase = str.toLowerCase();
	System.out.println(tolowerCase);
	
	boolean startsWith = str.startsWith("t");
	System.out.println(startsWith);
	
	boolean contains = str.contains("a");
	System.out.println(contains);
	
	int indexOf = str.indexOf("e");
	System.out.println(indexOf);
	
	int lastIndexOf = str.lastIndexOf("e");
	System.out.println(lastIndexOf);
	
	
	String[] split = str.split("");
	for(String sss:split) {
		System.out.println(sss);
	}
	
	char charAt = str.charAt(3);
	System.out.println(charAt);
	
	String replace = str.replace("er", "ing");
	System.out.println(replace);
	
	
	String substring = str.substring(0,4);
	System.out.println(substring);
	
	boolean empty = str.isEmpty();
	System.out.println(empty);
	
	
	String concat = str.concat(s);
	System.out.println(concat);
	
	int val=234;
	
	String valueOf = String.valueOf(val);
	System.out.println(valueOf);
	
	 int signedPositiveExample = Integer.parseInt("3");
	 System.out.println(signedPositiveExample);

	
	
//	if condition
	 Object[] data= {"raji","tharun","jayachandran",22,true};
	 for (int i = 0; i < data.length; i++) {
		if ("raji"==data[i]) {
			System.out.println("yes include");
		
		}
	}
	
	 
//	 if condition
	 int age=17;
	 if(age>=18) {
		 System.out.println("eligible for vote");
	 }else {
		 System.out.println("not eligible for vote");
	 }
	 
//	 if condition
	 int number=78;
	 if(number%2==0) {
		 System.out.println("even number");
	 }else {
		 System.out.println("odd number");
	 }
	 
//	 //	 else if condition
	
int percentage=80;
		if(percentage >= 90){
			System.out.println("Excellent: Grade A");
		}else if(percentage >= 80 && percentage < 90 ){
			System.out.println("Very Good: Grade B");
		}else if(percentage < 80 && percentage >= 70){
			System.out.println("Good: Grade C");
		}else if(percentage < 70 && percentage >= 60){
			System.out.println("Satisfactory: Grade D");
		}else {
			System.out.println("fail");
		}
	
	
}
}
