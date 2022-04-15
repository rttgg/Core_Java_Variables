package com.perscholas.java_basics;

public class CoreJavaLoop {

	public static void main(String[] args) {
		
/*Write a program that prints the Fibonacci Sequence from 0 to 50. 
 * The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,*/
		fibonacciExercise();
		//fibonacciExercisetwo();
		fibonacciExercisethree();
		
	}
	
	private static void fibonacciExercise() {
		System.out.println(0);
		System.out.println(1);
		for (int i = 0; i + (i+1) <= 50; i++) {
			System.out.println(i + (i + 1));
		}
	}
	
	private static void fibonacciExercisethree() {
	int num1 = 1, num2 = 0, fibNum = 0;
	while (fibNum <= 50) {		
		System.out.print(fibNum + " ");	
		fibNum = num1 + num2;
		num1 = num2;
		num2 = fibNum;	
	}



}
}
