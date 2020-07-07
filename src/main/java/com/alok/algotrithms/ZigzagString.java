package com.alok.algotrithms;

public class ZigzagString {
	public static String buildZigzag(String str , int frequency) {
		char charArr[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(i != charArr.length-1) {
			if(i == 0) {
				sb.append(charArr[0]);
			} else if(i + frequency < charArr.length){
				sb.append(charArr[i + frequency]);
			} else {
				
			}
			i++;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "geeksforgeeksgeeks";
		System.out.println(str);
	}
}
