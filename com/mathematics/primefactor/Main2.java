package com.mathematics.primefactor;

public class Main2 {
	public static void main(String[] args) {
//		optimized problem time complexity is an O(root(n)logn)
		int i=2;
		int n=900;
		while(i*i<=n) {
			while(n%i==0) {
				System.out.println(i);
				n/=i;
			}
			i++;
		}
		if(n>1) {
			System.out.println(n);
		}
	}
}
