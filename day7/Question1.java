package com.capgemini.quiz.day7;

public class Question1 {
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
