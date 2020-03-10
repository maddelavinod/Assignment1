package com.capgemini.assignmemt.first;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 4;
		primeNum(number);
	}

	public static void primeNum(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("not");
		}
	}

}
