package del2;

import java.util.Scanner;
public class Oppg4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv første tallet: ");
		a = sc.nextInt();
		System.out.println("Skriv andre tallet: ");
		b = sc.nextInt();
		System.out.println("Skriv tredje tallet: ");
		c = sc.nextInt();
		
		sc.close();
		int mina = Math.min(a, b);
		int minb = Math.min(b, c);
		
		System.out.println("Det laveste tallet er: " + Math.min(mina, minb));
		
	}

}
