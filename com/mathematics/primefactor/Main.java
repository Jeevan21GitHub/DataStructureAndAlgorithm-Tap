package com.mathematics.primefactor;

public class Main {
	public static void main(String[] args) {
		int n=900;
		
		int i=2;
		
		while(n>1) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			i++;
		}
	}
}
