package com.capgemini.quiz.day4;

public class QuestionOne {
	
        int width;
        int height;
        int length;
        int volume;
        void volume(int height, int length, int width) 
        {
             volume = width*height*length;
        } 
        
    
    
        public static void main(String args[])
        {
        	 QuestionOne obj = new  QuestionOne();
            obj.height = 1;
            obj.length = 5;
            obj.width = 5;
            obj.volume(3,2,1);
            System.out.println(obj.volume);        
        } 

}
