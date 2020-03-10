package com.capgemini.third;

public class TestD {
	public static void main(String[] args) {
		Object [] names={"shalini","srujana","pallavi","jenifer"};
		printnames(names);
		Object[] values=getnames();
		printnames(values);
		
	}
	static void printnames(Object[] n){
		for(int i=0;i<n.length;i++){
			System.out.println(n[i]);
		}
		
	}
	static Object[] getnames(){
		String[] names={"anu","divya","sreeja","priya"};
		return names;
	}

}
