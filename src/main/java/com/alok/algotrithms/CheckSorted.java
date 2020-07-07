package com.alok.algotrithms;

public class CheckSorted {
	public static boolean isSorted(int arr[], int index) {
		if(index == 1) {
			return true;
		} else {
			return (arr[index - 1] < arr[index -2]) ? false : isSorted(arr, index -1 );
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,8,9};
		
		int[] arr2 = {1,2,0,8,9};
		
		System.out.println("Is arr sorted " + isSorted(arr, 6));
		System.out.println("Is arr2 sorted " + isSorted(arr2, 5));
		
	}
}
