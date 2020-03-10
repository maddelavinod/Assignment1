package com.capgemini.quiz.day5;

public class Question1 {
	Question1(String s){
		
	} 
	Question1(){ 
		System.out.println("Question1");
	}
	}
	class B extends Question1{
		B(){
			
		} 
		B(String s){
			super(s);
		}
		void b(){
		//Insert which object here to compile this program
		//Question1 q= new Question1(5);
		//Question1 q = new Question1(String s);
		Question1 q= new Question1();
		}

}
