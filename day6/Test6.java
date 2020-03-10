package com.capgemini.quiz.day6;

public class Test6 extends Question6 {
	void display() {
		String n = myName();
		System.out.print("My name is " + n);
	}

	public static void main(String args[]) {
		Test6 t = new Test6();
		t.display();

	}
}
