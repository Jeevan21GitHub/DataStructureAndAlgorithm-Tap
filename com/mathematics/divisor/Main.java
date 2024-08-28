package com.mathematics.divisor;

public class Main {
	public static void main(String[] args) {
		int n=25;
		
		for(int a=1;a*a<=n;a++) {
			if(n%a==0) {
				int b=n/a;
				if(a!=b) {
					System.out.println(a+" "+b);
				}
				else {
					System.out.println(a);
				}
			}
		}
	}
}
