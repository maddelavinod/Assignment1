package com.capgemini.quiz.day7;

import com.capgemini.quiz.day5.Question7;

public class Question5 {
	private Question5(int data) {
		System.out.println("constructor");
	}

	protected static Question5 create(int data) {
		Question5 q1 = new Question5(data);
		return q1;
	}

	public void add() {
		System.out.println("addd method");

	}

}
