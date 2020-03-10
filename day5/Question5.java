package com.capgemini.quiz.day5;

final class Question5 {
	private double a, i;

	public Question5(double a, double i) {
		this.a = a;
		this.i = i;
	}

	Question5(Question5 q) {
		System.out.println("copy constructor");
		a = q.a;
		i = q.i;
	}

	public String toString() {
		return "(" + a + " " + i + "i)";
	}
}
