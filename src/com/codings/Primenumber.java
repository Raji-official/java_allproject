package com.codings;

public class Primenumber {

	private static void primenum() {
		int prime=0;
		int not=0;
		System.out.println("list of prime number");
		for (int i = 1; i <=100 ; i++) {
			int count =0;
			for (int j = 1; j <=i ; j++) {
				if (i%j==0){
					count += 1;
				}
			}
			if (count==2) {
				System.out.println(i+",prime numbers");
				prime++;
			}else {
				System.out.println(i);
				not++;
				
			}
		}
		System.out.println("Count of Prime number="+prime);
		System.out.println("not prime number="+not);
	}
		

	public static void main(String[] args) {
		primenum();
	}
	
}
