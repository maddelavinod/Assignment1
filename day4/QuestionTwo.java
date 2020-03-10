package com.capgemini.quiz.day4;

public class QuestionTwo {
	 int x;
     int y;
     boolean isequal()
     {
         return(x == y);  
     } 
 
 
     public static void main(String args[])
     {
    	 QuestionTwo obj = new  QuestionTwo();
         obj.x = 5;
         obj.y = 5;
         System.out.println(obj.isequal());
     } 

}
