package com.capgemini.quiz.day4;

public class TestTen { 
	

    public static void main(String[] args) { 
    	QuestionTen x = new QuestionTen(); 
    	QuestionTen y = new Derived(); 
        Derived z = new Derived(); 
        DoPrint(x);  
       DoPrint(y); 
      DoPrint(z); 
    }

}