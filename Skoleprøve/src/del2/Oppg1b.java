package del2;

import static javax.swing.JOptionPane.*;

public class Oppg1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = Integer.parseInt(showInputDialog("Tast inn en heltallsvariabel"));
		
		if (5 <= a && a <= 8) {
			showMessageDialog (null, + a + " er innenfor intervallet");
		}
		
		else {
			showMessageDialog (null, + a + " er utenfor intervallet");
		}
			
		}
				
	}

