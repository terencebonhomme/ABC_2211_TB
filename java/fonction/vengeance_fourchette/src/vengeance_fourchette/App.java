package vengeance_fourchette;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES

		String gagnant, premier;
		
		// PROGRAMME

		premier = determinerPremier();

		gagnant = jeu(premier);

		System.out.println("Le vainqueur est " + gagnant + "!");
		
		// FIN PROGRAMME

	}

	public static String jeu(String premier) {
		
		// VARIABLES

		int nombre, min, max, borneMin, borneMax, essai;
		boolean quitter;
		String joueur = premier;

		Random rand = new Random();
		borneMin = 0;
		borneMax = 100;

		Scanner sc = new Scanner(System.in);

		min = 0;
		max = 100;

		quitter = false;
		
		// FONCTION
		
		System.out.println("Le premier est " + joueur + ".");
		
		nombre = rand.nextInt(borneMax - borneMin + 1) + borneMin;				

		do {

			if (joueur.equals("joueur1")) {
				System.out.print("\nJoueur1! Saisir un nombre entre " + min + " et " + max + " : ");
				essai = sc.nextInt();	
				//System.out.println(essai);
			} else {
				System.out.print("\nOrdinateur! Saisir un nombre entre " + min + " et " + max + " : ");
				essai = rand.nextInt(max - min + 1) + min;
				System.out.println(essai);
			}

			if (essai == nombre) {
				sc.close();
				return joueur;
			} else if (essai < nombre) {
				min = essai + 1;
				
				joueur = changerJoueur(joueur);
			} else {
				max = essai - 1;
				
				joueur = changerJoueur(joueur);
			}

		} while (!quitter);
		
		sc.close();

		return joueur;
		
		// FIN FONCTION
	}

	public static String determinerPremier() {
		
		// VARIABLES
		
		int borneMin, borneMax, aleatoire;
		Random rand = new Random();
		
		// FONCTION
		
		borneMin = 0;
		borneMax = 1;

		aleatoire = rand.nextInt(borneMax - borneMin + 1) + borneMin;

		if (aleatoire == 0) {
			return "joueur1";
		} else {
			return "ordinateur";
		}
		
		// FIN FONCTION
	}
	
	public static String changerJoueur(String joueur) {
		
		// FONCTION
		
		if(joueur.equals("joueur1")) {
			return "ordinateur";
		} else {
			return "joueur1";
		}
		
		// FIN FONCTION
	}

}
