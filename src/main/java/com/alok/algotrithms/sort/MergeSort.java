package com.alok.algotrithms.sort;

public class MergeSort {
	public static void sort(int arr[], int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			merge(arr,left,mid,right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int[] arr1 = new int[mid-left + 1];
		int[] arr2 = new int[right-mid];
		for(int i = left; i < arr1.length; i++) {
			arr1[i] = 
		}
	}
}
