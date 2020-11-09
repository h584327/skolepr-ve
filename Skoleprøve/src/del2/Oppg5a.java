package del2;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class Oppg5a {

	public static void main(String[] args) {
		
		double radiusTekst = Double.parseDouble(showInputDialog("tast inn sirkelens radius: "));
		
		double radius = (radiusTekst);
		double radius2 = radius * radius;
		
		double areal = radius2 * PI;
		
		showMessageDialog (null, areal);
		
	}

}

