package com.capgemini.quiz.day3;

public class QuestionEight {
	int m_x, m_y;

	public QuestionEight(int x, int y) {
		//this(); 
		m_x = x;
		m_y = y;
	}

	public QuestionEight() {
		this(10, 10);
	}

	public int getX() {
		return m_x;
	}

	public int getY() {
		return m_y;
	}

	public static void main(String args[]) {
		QuestionEight p = new QuestionEight(20,20);
		System.out.println(p.getX());
		System.out.println(p.getY());
	}

}
