package com.capgemini.quiz.day7;

import com.capgemini.quiz.day4.QuestionTen;

public class Question10 {
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
