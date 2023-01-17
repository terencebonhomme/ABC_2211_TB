package denombrer_nombre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// VARIABLES

		String texte;
		String texte_minuscules;
		int[] compteur_alphabet = new int[26];
		
		final int PREMIERE_LETTRE = 97;
		final int DERNIERE_LETTRE = 122;
		
		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME

		texte = sc.nextLine();

		texte_minuscules = texte.toLowerCase();
		char[] texte_tableau = texte_minuscules.toCharArray();

		for (int lettre = PREMIERE_LETTRE; lettre <= DERNIERE_LETTRE; lettre++) {
			compteur_alphabet[lettre - PREMIERE_LETTRE] = 0;
			for (int i = 0; i < texte_tableau.length; i++) {
				if ((int) texte_tableau[i] == lettre) {
					compteur_alphabet[lettre - PREMIERE_LETTRE]++;
				}
			}
			if(compteur_alphabet[lettre - PREMIERE_LETTRE] > 0) {
				System.out.print((char) lettre + ":" + compteur_alphabet[lettre - PREMIERE_LETTRE] + "; ");				
			}
		}
		
		sc.close();

		// FIN PROGRAMME
	}

}
