package com.capgemini.quiz.day5;

public class Question7 {
	
	private Question7(int data) {
		System.out.println("constructor");
	}

	protected static Question7 create(int data) {
		Question7 q1 = new Question7(data);
		return q1;
	}

	public void add() {
		System.out.println("addd method");

	}

}

