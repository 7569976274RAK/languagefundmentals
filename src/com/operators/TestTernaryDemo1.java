package com.operators;

import java.util.Scanner;

//ternary operators ------>
//syntax : 
//condition ? value_if_true : value_if_value
public class TestTernaryDemo1 {

	public static void main(String[] args) {

		
		int x = 10;
		int y = 20;
		int z =5;
		
		int max1 = (x > y)?( x > z ? x : z) : (y > z ? y : z);
		System.out.println("max1 value is : "+max1);
		
		int a = 10;
		int b = 20;

		int max = (a > b) ? a : b;

		System.out.println("max value is : " + max);

		Scanner sc = new Scanner(System.in);// 21:56
		System.out.println("Enter your age ?");

		int age = sc.nextInt();
//		boolean isEligible = (age > 18) ? true : false;

		
		String isEligible = (age > 18)? "yes" : "no";
		System.out.println("the entered age is eligible..?" + isEligible);
	}

}
