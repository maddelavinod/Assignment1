package com.capgemini.quiz.day6;

public class Question2 {

	/*
	 * static{ int a = 5; } compile time error (the variable 'a' in static block
	 * cannot able to access using this keyword)
	 * 
	 * 
	 */
	public static void main(String args[]) {
		new Question2().call();
	}

	private static int a;//

	void call() {
		this.a++;
		System.out.print(this.a);
	}

}
