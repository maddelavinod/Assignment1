package com.capgemini.quiz.day5;

public class Question8 {
	public Question8() {
		System.out.println("1");
		new Question8(10);
		System.out.println("5");
	}

	public Question8(int a) {
		System.out.println("2");
		new Question8(10, 15);
		System.out.println("4");

	}

	public Question8(int a, int b) {
		System.out.println("3");
	}
}

class T {
	public static void main(String[] args) {
		Question8 q = new Question8();
		
	}
}


