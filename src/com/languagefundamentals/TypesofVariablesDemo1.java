package com.languagefundamentals;

public class TypesofVariablesDemo1 {
	
	// primitve + instance variable 
	int id;
	
	// Object + instance variable
	String name;
	
	//Primitive + static
	static int collegeId = 55;
			
	//Object + static variable
	static String CollegeName = "Vcube";
	
	public static void main(String[] args) {
		System.out.println("main method started !!");
//		Object Creation to access instance data members
		TypesofVariablesDemo1 t1 = new TypesofVariablesDemo1();
		System.out.println(t1.id);//0
		System.out.println(t1.name);//null
		
		System.out.println("Accessing static data*****");
		// Accessing static data directly...
		System.out.println(collegeId);		
		System.out.println(CollegeName);
	
		
		//static data members we can access by using class name
		//Sometime,we need to access  the static data outside of the class
		//then we must need to access through Class name.
		//Accessing static data through class name is always recommended. 
		System.out.println(TypesofVariablesDemo1.collegeId);
		System.out.println(TypesofVariablesDemo1.CollegeName);

		
		//static data we can access by using object refernce variable also
		System.out.println(t1.collegeId);
		System.out.println(t1.CollegeName);
	}

}
