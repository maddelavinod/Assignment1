package com.capgemini.quiz.day4;

public class QuestionTen {
	public void Print() { 
        System.out.println("Base"); 
    }          
} 
  
class Derived extends QuestionTen {     
    public void Print() { 
        System.out.println("Derived"); 
    } 
    
    public  void Do(QuestionTen o ) { 
        o.Print();  

  }  
    }

