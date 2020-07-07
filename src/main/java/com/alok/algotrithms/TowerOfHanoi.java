package com.alok.algotrithms;

public class TowerOfHanoi {
	//n , a b c
	public static void build(int n, String from, String to, String aux) {
		if(n == 1) {
			System.out.println("Moving disk 1 from peg " + from + " to peg "+ to);
			return;
		} else {
			//n , a c b
			build(n-1, from, aux, to);
			System.out.println("Moving disk  from peg " + from + " to peg "+ to);
			//n, c b a
			build(n-1, aux, to, aux);
		}
	}
	
	public static void main(String[] args) {
		build(3, "A", "B", "C");
	}
}
