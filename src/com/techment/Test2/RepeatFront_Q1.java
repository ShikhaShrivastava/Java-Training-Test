package com.techment.Test2;

class Question1
{
	public void repeatFront(String str, int n) {
		int strlen = str.length();
		String output = " ";
		for (int i = n; n > 0; n--)
		{
			output+=str.substring(0,n);
		}
		System.out.println(output);
	}
}
public class RepeatFront_Q1 {

	public static void main(String[] args) {

		Question1 question1= new Question1();
		question1.repeatFront("Chocolate", 4);
		question1.repeatFront("Chocolate", 3);
		question1.repeatFront("Ice Cream", 2);

	}

}
