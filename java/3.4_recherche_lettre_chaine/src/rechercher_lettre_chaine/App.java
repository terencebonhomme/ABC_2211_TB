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
		
		// JEU DE TESTS
		
		System.out.println("test 1 : a avec chaine vide");
		System.out.println("test 2 : a avec .");
		System.out.println("test 3 : a avec Cras eget tellus et nibh porta egestas.");
		System.out.println("test 4 : a avec Cras eget tellus et nibh porta egestas");
		System.out.println("test 5 : z avec Cras eget tellus et nibh porta egestas.");
		
		
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
		}else if(chaine.charAt(chaine.length() - 1) != '.') {
			System.out.println("LA CHAINE NE FINIT PAS PAR UN POINT");
		}else {
			while(chaine.charAt(i) != '.') {
				if(chaine.charAt(i) == lettre.charAt(0)) {
					occurrence++;
				}
				i++;
			}
			
			System.out.println(lettre + " A " + occurrence + " OCCURENCE(S)");
		}
										
		// FIN PROGRAMME
		
		// DEBUT TESTS
		
		if(chaine.length() == 0 && lettre.charAt(0) == 'a') System.out.println("test 1 : " + (occurrence == 0));
		if(chaine.length() == 1 && lettre.charAt(0) == 'a') System.out.println("test 2 : " + (occurrence == 0));
		if(lettre.charAt(0) == 'a' && chaine.equals("Cras eget tellus et nibh porta egestas.")) System.out.println("test 3 : " + (occurrence == 3));
		if(lettre.charAt(0) == 'a' && chaine.equals("Cras eget tellus et nibh porta egestas")) System.out.println("test 4 : " + (occurrence == 0));
		if(lettre.charAt(0) == 'z' && chaine.equals("Cras eget tellus et nibh porta egestas.")) System.out.println("test 5 : " + (occurrence == 0));
		
		// FIN TESTS
	}

}
