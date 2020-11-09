package del2;

import static javax.swing.JOptionPane.*;

public class Oppg1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = Integer.parseInt(showInputDialog("Tast inn en heltallsvariabel"));
		
		if (a < 0) {
			showMessageDialog(null, "Verdien er mindre enn null");
		}
		
		if (a > 0) {
			showMessageDialog(null, "Verdien er større enn null");
		}
		
		if (a == 0) {
			showMessageDialog(null, "Verdien er lik null");
			
		}
	}

}
