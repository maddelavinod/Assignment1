package com.capgemini.quiz.day1;

public class QuestionOne {
	public static void main(String[] args) {
		loop1:for(int i=0;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==3)
				{
					break loop1;
				}
				System.out.println("sample");
			}
		}
	}

}
