package de.demmer.dennis;

public class Aufgabe3Loesung {

	
	// 1. Hat die Methode einen Rückgabewert?
	// 2. Methodenname wählen
	// 3. Braucht die Methode Argumente? Wenn ja: welche und wieviele?
	// 4. Logik implementieren (in dem fall i+y)
	// 5. Rückgabewert über return zurückgeben
	
	

	//↓  Programmiert hier eine Methode die zwei int-Variablen aus der main Methode addieren kann.
	//Die Methode soll als Rückgabewert das Ergebnis der Addition haben.
	
	
	static int addiere(int i, int y) {
		
		int x = i + y;
		
		return x;
	}
	
	
	
	//↑
	
	
	
	

	
	
	public static void main(String[] args) {
		
		int zahl1 = 5;
		
		int zahl2 = 10;
		
		int ergebnis = 0;
		
		//↓ hier soll eure Methode aufgerufen werden. Weißt der variabel 'int ergebnis' den Rückgabewert eurer Methode zu
		
		ergebnis = addiere(zahl1, zahl2);
		

		//↑

		
		System.out.println(ergebnis);

	}
	
	
}
