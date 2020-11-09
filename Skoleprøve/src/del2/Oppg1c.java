package del2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg1c {
	

	public static void main(String[] args) {
	

	int tall = parseInt(showInputDialog("Skriv ett heltall fra 0 til 4: "));
	String verdi = " ";

	switch (tall) {
	case 0:
		verdi = "null";
		break;
	case 1:
		verdi = "en";
		break;
	case 2:
		verdi = "to";
		break;
	case 3:
		verdi = "tre";
		break;
	case 4:
		verdi = "fire";
		break;
	default:
	 	verdi = "ulovlig verdi";
	 	
	    }
	
	showMessageDialog(null, verdi);
	
	}
	
}
