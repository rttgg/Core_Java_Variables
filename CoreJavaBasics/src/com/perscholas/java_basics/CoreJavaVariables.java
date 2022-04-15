package com.perscholas.java_basics;

public class CoreJavaVariables {

	public static void main(String[] args) {
		questionOne();
		questionTwo();
		questionThree();
		questionFour();
		questionFive();
		questionSix();
		questionSeven();
		questionEight();
	}
/* 1 Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
	Assign the sum to a variable. Print out the result.*/
	public static void questionOne() {
		int num1 = 5;
		int num2 = 10;
		int sum = num1 + num2;
		System.out.println(sum);
	}

	/* 2. Write a program that declares 2 double variables, assigns a number to each, and adds them together. Assign the sum to a variable. 
	 * Print out the result.*/
	public static void questionTwo() {
		double num1 = 1.5;
		double num2 = 2.4;
		double sum = num1 + num2;
		System.out.println(sum);
	}
	
	/*3 Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. 
What variable type must the sum be?*/
	public static void questionThree() {
		int numInt1 = 2;
		double numInt2 = 3.56;
		double sum = numInt1 + numInt2;
		System.out.println(sum);
	}
	
	/* 4. Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. 
	 * What happens? What corrections are needed?*/
	public static void questionFour() {
		int num1 = 6;
		// change the variable to decimal mismatch can not convert double to int
		//int num2 = 12.0;
		// or change the type to double
		//double num2 = 12.0;
		int num2 = (int) 12.0;
		int result = num2/num1;
		System.out.println(result);
	}
	
	/*5. Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. Assign the result to a variable. Print out the result. 
	 * Now, cast the result to an integer. Print out the result again.*/
	public static void questionFive() {
		double num1 = 3.5;
		double num2 = 2.4;
		double result = (int)num1/num2;
		System.out.println(result);	
	}
	
	/*6. Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. 
	 * Now, cast y to a double and assign to q. Print q again.*/
	public static void questionSix() {
		int x = 5;
//		int y = 6;
//		int q = y/x;
//		System.out.println(q);
		double y = 6;
		int q = (int) (y/x);
		System.out.println(q);
	}
	
	/*7. Write a program that declares a named constant and uses it in a calculation. 
	print the result.*/
	public static void questionSeven() {
		double sideOfTriangle1 = 3.0;
		double sideOfTriangle2 = 2.3;
		double areaOfTriange = 0.5 * (sideOfTriangle1 * sideOfTriangle2);
		System.out.println(areaOfTriange);
		
	}
	
	/*8. Write a program where you create 3 variables that represent 
	 products at a cafe. The products could be beverages like coffee, 
	  cappuccino, espresso, green tea, etc. Assign prices to each product. 
	  Create 2 more variables called subtotal and totalSale and complete 
	  an “order” for 3 items of the first product, 4 items of the second
	   product, and 2 items of the third product. Add them all together to
	    calculate the subtotal. Create a constant called SALES_TAX and add
	     sales tax to the subtotal to obtain the totalSale amount. Be sure
	      to format the results to 2 decimal places.*/
	
	public static void questionEight() {
		double coffee = 2.4;
		double cappuccino = 2.8;
		double espresso =3.1;
		double subTotal = 3* coffee + 4 * cappuccino + 2 * espresso;
		double salesTax = 3.2;
		float totalSale = (float) (subTotal + salesTax);
		System.out.println(totalSale);
	}
	
	

}
