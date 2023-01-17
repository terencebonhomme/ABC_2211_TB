package palindrome;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// VARIABLES

		String texte;
		boolean estPalindrome;
		int moitie;

		estPalindrome = true;

		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME

		System.out.print("Saisir un texte : ");
		texte = sc.nextLine();

		if (texte.length() == 0) {
			System.out.println("LA CHAINE EST VIDE");
		} else if (texte.length() == 1) {
			System.out.println("CHAINE D'AU MOINS 2 CARACTERES");
		} else {
			// les espaces ne sont pas pris en compte dans l'un des exemple
			texte = texte.replaceAll(" ", "");
			
			// stopper à la moitié pour ne pas vérifier 2 fois
			if (texte.length() % 2 == 0) {
				moitie = texte.length() / 2 - 1;
			} else {
				moitie = (texte.length() - 1) / 2;
			}

			// le texte est un palindrome jusqu'à preuve du contraire
			for (int i = 0; i <= moitie && estPalindrome; i++) {
				System.out.println(i + " -> " + texte.charAt(i) + " et " + texte.charAt(texte.length() - 1 - i));
				if (texte.charAt(i) != texte.charAt(texte.length() - 1 - i)) {
					estPalindrome = false;
				}
			}

			if (estPalindrome) {
				System.out.println("CE TEXTE EST UN PALINDROME");
			} else {
				System.out.println("CE TEXTE N'EST PAS UN PALINDROME");
			}
		}
		
		sc.close();

		// FIN PROGRAMME
		
		// DEBUT TESTS
		
		switch(texte) {
		case "AA" :
			System.out.println(estPalindrome == true);
			break;
		case "38783" :
			System.out.println(estPalindrome == true);
			break;
		case "LAVAL" :
			System.out.println(estPalindrome == true);
			break;
		case "LAVALAETEALAVAL" :
			System.out.println(estPalindrome == true);
			break;
		case "ETLAMARINEVAVENIRAMALTE" :
			System.out.println(estPalindrome == true);
			break;
		case "A10A" :
			System.out.println(estPalindrome == false);
			break;
		case "382783" :
			System.out.println(estPalindrome == false);
			break;
		case "LAV3AL" :
			System.out.println(estPalindrome == false);
			break;
		case "LAVAL4AETEALAVAL" :
			System.out.println(estPalindrome == false);
			break;
		case "ETLAMARINEVAVENI5RAMALTE" :
			System.out.println(estPalindrome == false);
			break;
		default :
			break;
		}		
		
		// FIN TESTS
	}

}
