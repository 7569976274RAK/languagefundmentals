package com.operators;

public class TestUnary2 {

	public static void main(String[] args) {
		
		int a = 5;
		int b =4;
		
		System.out.println(b++);//4----> 5
		System.out.println(++a);//a = a+1 =6
		System.out.println(b--);//5--->4	
		System.out.println(--b);//4---->3
		System.out.println(a--);//6---->5
		System.out.println(b++);//3--->4
		System.out.println(++b);//4---->5
		System.out.println(--a);//5--->4
		System.out.println(a-b);//-1
		System.out.println(a++);//4---->5
		System.out.println(--b);//5--->4

		System.out.println("a value is :" +a);
		System.out.println("b value is :"+b);
		
		//5+4 = 9 ---->7+6 = 13 --->13+9 = 22
		System.out.println(a++ + b++ + ++a + ++b);
		//7+7 = 14 -9 = 5+6=11
		System.out.println(a++ + ++b - ++a + --b);
	}

}
