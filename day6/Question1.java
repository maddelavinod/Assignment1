package com.capgemini.quiz.day6;

public class Question1 {
	private double radius;

	public Question1(double radius) {
		radius=radius;
		System.out.println(radius);

	}

	void display() {
		System.out.println(radius);
	}

	public static void main(String[] args) {
		Question1 m = new Question1(10);
		m.display();
		

	}


}
