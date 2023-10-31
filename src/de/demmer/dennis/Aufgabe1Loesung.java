package de.demmer.dennis;

public class Aufgabe1Loesung {

	//Dieses Programm hat eine Methode die überprüft ob eine Zahl gerade ist
	
	//Warum funktioniert diese Programm nicht?
	
	
	static boolean isEven(int i) {
		boolean b = i%2 == 0;
		
		return b;
//		return  i%2 == 0; geht auch
	}
	
	
	public static void main(String[] args) {
		
		int number = 20; 
		System.out.println("Ist " + number + " gerade? " + isEven(number));
		
		
		
	}
	

	
}
