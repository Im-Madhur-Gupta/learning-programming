package com.company; // a package = group of classes

public class Main { // class = group of methods, essential

    public static void main(String[] args)
	{
		// main function/method, start point of execution, essential
		// $ and _ are both allowed in variable names.
		// Unlike Python, Java is statically typed matlab variable ka datatype batana padega
		// java me char datatype is of size 2 bytes as it supports UNICODE, a set containing ASCII
		// and other characters

		System.out.println("Hi There, I'm learning java.");
		int a=1;
		int b=2;
		int c=3;
		System.out.print("Sum is : ");
		System.out.print(a+b+c);
		// System.out.println - prints wherever the control is currently, then adds a new line
		// whereas System.out.print - prints wherever the control is currently
		// Alt - System.out.println("Sum is : " + (a+b+c) );
    }
}
