package com.capgemini.quiz.day5;

public class Question6 {
	static int a;
	static {
		a = 4;
		System.out.println("inside static bock");
		System.out.println("a value is " + a);
	}

	Question6() {
		System.out.println("inside constructor ");
		a = 10;

	}

	public static void fun() {
		a = a + 10;
		System.out.println("a value is " + a);

	}

	public static void main(String[] args) {
		Question6 q = new Question6();
		q.fun();
	}
}
