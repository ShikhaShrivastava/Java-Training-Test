package com.techment.Test2;

class Question2
{
	public void repeatEnd(String str, int n) {
		String output = " ";
		int strlen = str.length();  //3,2,1
		
		for (int i = 0; i<n; i++)
		{
			output+=str.substring(strlen-n, strlen);
		}
		System.out.println(output);
	}
}

public class RepeatEnd_Q2 {

	public static void main(String[] args) {
		Question2 question2= new Question2();
		question2.repeatEnd("Hello", 3);
		question2.repeatEnd("Hello", 2);
		question2.repeatEnd("Hello", 1);


	}

}
