package com.languagefundamentals;

public class TestDataTypeDemo2 {

	public static void main(String[] args) {
		
		int i = 10;
		
// converting primitive to wrapper is called "auto-boxing"
    Integer i1 = i;
    System.out.println(i1);
    
    Integer i2 = 100;// primitive value to wrapper is called auto-boxing
    int i3 = i2; // converting wrapper object data to primitve is called "auto-unboxing"
	
	System.out.println(i3);
	
	byte b1 = 10;
	byte b2 = b1;
	System.out.println(b2);
// should be byte to byte or int to int
// Integer i3 = b2;
//	System.out.println();
	
	Integer i4 = 127;
	Integer i5 = 127;
	
	System.out.println(i4==i5);//both are same
			
	Integer i6 = 277;
	Integer i7 = 327;
	System.out.println(i6==i7);//both are not same
	}

}
