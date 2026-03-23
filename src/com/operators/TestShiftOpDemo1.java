package com.operators;

public class TestShiftOpDemo1 {

	public static void main(String[] args) {

		int a = 77;
		int b = 3;

		System.out.println(a << b);// left shift operator// 77 * (2*3) = 77 * 4 = 308

		int a1 = 15;
		int b1 = 2;
		System.out.println(a1 >> b1); //right shift operator// 15 / (2²)= 15 / 4 = 3 (integer division)
		System.out.println(a1 >>> b1);//signed right shift operator
	}

}
