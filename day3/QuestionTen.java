package com.capgemini.quiz.day3;

public class QuestionTen {

	static int a;

	static {
		a = 4;
		System.out.println("inside static blockn");
		System.out.println("a = " + a);
	}

	QuestionTen() {
		System.out.println("ninside constructorn");
		a = 10;
	}

	public static void func() {
		System.out.println("function method");
		a = a + 1;
		System.out.println("a = " + a);
	}

	public static void main(String[] args) {

		QuestionTen obj = new QuestionTen();
		obj.func();

	}
}