package del2;

import static javax.swing.JOptionPane.*;

public class Oppg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String melding = "Skriv inn et heltall: ";
		
		int sum = 0;
		int antall = 0;
		
		int tall = Integer.parseInt(showInputDialog(melding));
		while (tall != 0) {
		
			sum += tall;
			antall++;
			tall = Integer.parseInt(showInputDialog(melding));
			
		}
		
		int sammenlagt = sum;
		System.out.println("Antall tall: " + antall);
		System.out.println("Sum: " + sammenlagt);
	}
	
}
