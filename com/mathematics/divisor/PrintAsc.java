package com.mathematics.divisor;

public class PrintAsc {
	public static void main(String[] args) {
		int n=100;
		int a=1;
		while(a*a<=n) {
			if(n%a==0) {
				System.out.print(a+" ");
			}
			a++;
		}
		while(a*a>=1) {
			if(n%a==0) {
				if(n/a!=a) {
					System.out.print(n/a+" ");
				}
			}
			a--;
		}
	}
}
