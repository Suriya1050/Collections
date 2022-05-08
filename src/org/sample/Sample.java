package org.sample;

public class Sample {
	
	public static void main(String[] args) {
		// Type casting
		
		//up casting
		byte age = 30;
		int a =age;

	 System.out.println(a);
	
	//down casting
		
		int id = 1234;
		//byte b= id; 
		
		//Syntax= dataType refName = (dataType)oldVariable
		byte c = (byte)id;
		System.out.println(c);


	}

}
