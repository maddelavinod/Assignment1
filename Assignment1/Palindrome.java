package com.capgemini.assignmemt.first;

public class Palindrome {
	public static void main(String[] args) {
		int number = 232;
		palindrome(number);
	}

	public static void palindrome(int n) {
		int num = n, digit = 0, rev = 0;
		while (n > 0) {
			digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}

		if (rev == num) {
			System.out.println("given number is palindrom number");
		} else {
			System.out.println("not palindrome");
		}
	}

}
