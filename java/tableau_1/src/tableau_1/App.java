package tableau_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		String[] prenom = new String[] {"p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12"};
		Scanner sc = new Scanner(System.in);
		int choix;
		
		// DEBUT PROGRAMME
		
		System.out.println("Quel est votre choix");
		choix = sc.nextInt();
		
		if(choix >= 1 && choix <= prenom.length) {
			System.out.println("Bonjour " + prenom[choix - 1]);
		} else {
			System.out.println("Error 404 not found");
		}
		
		// FIN PROGRAMME
		
	}

}
