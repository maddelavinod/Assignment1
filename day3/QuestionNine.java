package com.capgemini.quiz.day3;

final class QuestionNine {
	private double a, b;

	public QuestionNine(double a, double b) {
		this.a = a;
		this.b = b;
	}

	QuestionNine(QuestionNine c) {
		System.out.println("Copy constructor called");
		a = c.a;
		b = c.b;
	}

	public String toString() {
		return "(" + a + " + " + b + "i)";
	}

	public static void main(String[] args) {
		QuestionNine c1 = new QuestionNine(10, 15);
		QuestionNine c2 = new QuestionNine(c1);
		QuestionNine c3 = c1;
		System.out.println(c2);
	}

}
