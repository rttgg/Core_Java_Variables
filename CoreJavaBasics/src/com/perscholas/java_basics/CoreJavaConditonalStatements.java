package com.perscholas.java_basics;

import java.util.Scanner;

public class CoreJavaConditonalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		questionNumberOne();
		questionNumberTwo();
		questionNumberThree();
		questionNumberFour();
		questionNumberFive();
	

	}
	public static void questionNumberOne() {
		int x = 7;
		if (x < 10) {
			System.out.println( x = 15);
			}
	}
	
	public static void questionNumberTwo() {
		int x = 7;
		if (x < 10) {
			System.out.println( x = 15);
		}
		else System.out.println("x is greater that 10");
	}
	
	//Write a program that declares 1 integer variable x, and then assigns 15 to it.=>  x=15
	//Write an “if-else-if” statement that prints out “Less than 10” => if x is less than 10, if x > 10 print less than 10
	//“Between 10 and 20” 
	//if x is greater than 10 but less than 20, and “Greater than or equal to 20”=> 10 < x < 20 && x >=20
	//if x is greater than or equal to 20. => x >= 20
	// Change x to 50 and notice the result. print x = 50
	public static void questionNumberThree() {
		int x = 50;
		if (x < 10) {
			System.out.println("Less than 10");
		}
		if ((x > 10) || (x < 20)) {
			System.out.println("Between 10 and 20");}
		else if (x >= 20){
			System.out.println("Greater than or equal to 20");
		}
	}
	
	public static void questionNumberFour() {
		int x = 15;
		if (x < 10 || x > 20) {
			System.out.println("Out of range");
		}
		if ((x > 10 && x < 20) || (x == 10 || x == 20)) {
			System.out.println("In range");
		}
		else System.out.println("Is not in range");
	}
	
	public static void questionNumberFive() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Grade: ");
		int grade = input.nextInt();
		if (grade <= 100 && grade >= 90) {
			System.out.println("A");
		}
		else if (grade <= 89 && grade >=80) {
			System.out.println("B");
		}
		else if (grade <= 79 && grade >=70) {
			System.out.println("C");
		}
		else if (grade <= 69 && grade >=60) {
			System.out.println("D");
		}
		else if (grade < 60) {
			System.out.println("F");
		}
		else 
			System.out.println("Score out of range");
		System.out.println(grade);
		
	}
	
/*Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to 
 * print out the corresponding weekday. Print “Out of range” if the number 
 * is less than 1 or greater than 7. Don’t forget to include “break” statements in each of your cases.*/

//	public static void questionNumberSix() {
//		Scanner inputOneToSeven = new Scanner(System.in);
//		System.out.println("Choose number between 1- 7: ");
//		int inputNumber = inputOneToSeven.nextInt();
//		Switch () {
//			case 1: inputNumber = "Monday"; break;
//			case 2: inputNumber = "Tuesday"; break;
//			case 4: inputNumber = "Wednesday"; break;
//			case 5: inputNumber = "Thursday"; break;
//			case 6: inputNumber = "Friday"; break;
//			case 7: inputNumber = "Saturday"; break;
//			case 8: inputNumber = "Sunday"; break;
//		break;
//		}
//		System.out.println(inputOneToSeven);
//	}
//	
}
