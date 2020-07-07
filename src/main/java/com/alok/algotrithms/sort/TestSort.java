package com.alok.algotrithms.sort;

public class TestSort {
	public static void main(String[] args) {
		int[] arr = {4,6,5,3,23,6,43};
		System.out.println("------Bubble Sort------ ");
		for(int i : BubbleSort.sort(arr)) {
			System.out.print(i+",");
		}
		
		System.out.println("\n\n------Selection Sort------ ");
		for(int i : SelectionSort.sort(arr)) {
			System.out.print(i+",");
		}
		
		System.out.println("\n\n------Insertion Sort------ ");
		for(int i : InsertionSort.sort(arr)) {
			System.out.print(i+",");
		}
	}
}
