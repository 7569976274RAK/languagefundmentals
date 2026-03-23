package com.operators;

public class TestOperators1 {

	// Assignment Operators or Compund Operators are
	// = += -+ /+ %=
	public class Operators1 {

		public static void main(String[] args) {

			int result = 0;
			double a = 5.5;
//			result = result +a;//type mismatch:cannot convert from double to int

			result += a;// result = result + a
			System.out.println("Addition : " + result);// 5

			double b = 2.9;
//			result = (int)(result -b);//Type mismatch: cannot convert from double to int
			result -= b;
			System.out.println("substraction : " + result);// 2

			double c = 4.7;
			// result = result * c;
			result *= c;
			System.out.println("multiplication :" + result);// 9

			double d = 3;
			result /= d;
			System.out.println("Division or Quotient :" + result);// 3

			double e = 1;
			result %= e;// result = result%e;------> result = 3/1 =0
			System.out.println("Modulus or Reminder :" + result);
		}

	}

}
