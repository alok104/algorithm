package com.alok.algotrithms;

public class StringWithNbit {
	public static void build(char arr[] , int n) {
		if(n < 1) {
			System.out.println(arr.toString());
			return;
		} else {
			arr[n-1] = 0;
			build(arr, n-1);
			arr[n-1] = 1;
			build(arr, n-1);
		}
	}
	
	public static void main(String[] args) {
		char[] a = {' ',' ',' ',' ',' ',' '};
		build(a, a.length);
	}
}
