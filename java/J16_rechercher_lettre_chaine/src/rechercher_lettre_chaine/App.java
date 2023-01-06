package rechercher_lettre_chaine;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		String chaine;
		String lettre;
		int occurrence = 0;
		char[] chaine_caractere = new char[100];
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("saisir une chaine qui se termine par un point");
		chaine = sc.nextLine();
		
		System.out.println("saisir une lettre");
		lettre = sc.nextLine();		
		
		if(
				chaine.length() == 0 
				|| chaine.length() == 1 && chaine.charAt(0) == '.'
		) 
		{
			System.out.println("LA CHAINE EST VIDE");
			
		}else {
			while(chaine.charAt(i) != '.') {
				if(chaine.charAt(i) == lettre.charAt(0)) {
					occurrence++;
				}
				i++;
			}
			
			System.out.println(lettre + " A " + occurrence + " occurence(s)");
		}
										
		// FIN PROGRAMME		
	}

}
