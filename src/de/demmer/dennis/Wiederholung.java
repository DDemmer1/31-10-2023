package de.demmer.dennis;

public class Wiederholung {
	
	
	static boolean isEven(int i) {
		boolean even;
		even = i % 2 == 0;
		return even;
	}
	
	static void printFiveTimes(String input) {
		System.out.println(input);
		System.out.println(input);
		System.out.println(input);
		System.out.println(input);
		System.out.println(input);
	}

	
	
	public static void main(String[] args) {
		
		printFiveTimes("Test");
		printFiveTimes("Hallo");
		
		
		//...
		
		int i = 25;
		
		boolean b = i % 2 == 0;
		
		System.out.println(i + " ist ungerade? " + b);
		
		//...
		
		int y = 18;
	
		boolean b2 = y % 2 == 0;
		System.out.println(y +" ist gerade? " + b2);
		
		
		// ...
		
		System.out.println(20 + " ist gerade? " + isEven(20));
		boolean b5 = isEven(20);
		isEven(15);
		isEven(15);
		isEven(15);
		isEven(15);
		isEven(15);
		isEven(15);
		isEven(15);
		isEven(15);
		isEven(15);
		isEven(15);
		
		
	}
	
	
	

}
