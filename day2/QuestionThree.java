package com.capgemini.quiz.day2;

public class QuestionThree {
	public static void main(String[] args) {
		int i = 0, j = 5;
		for (; (i < 3) && (j++ < 10); i++) {
			System.out.println("" + i + "" + j);
		}
		System.out.println("" + i + "" + j);
	}

}
