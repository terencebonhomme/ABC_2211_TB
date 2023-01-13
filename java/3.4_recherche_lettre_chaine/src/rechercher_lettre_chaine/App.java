package rechercher_lettre_chaine;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		String chaine;
		char lettre;
		int occurrence = 0;
		char[] tableau_chaine;
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
		
		tableau_chaine = chaine.toCharArray();
		System.out.println(tableau_chaine[1]);
		
		System.out.println("saisir une lettre");
		lettre = sc.nextLine().charAt(0);						
		
		if(
				tableau_chaine.length == 0 
				|| tableau_chaine.length == 1 && tableau_chaine[0] == '.'
		) 
		{
			System.out.println("LA CHAINE EST VIDE");
		}else if(tableau_chaine[tableau_chaine.length - 1] != '.') {
			System.out.println("LA CHAINE NE FINIT PAS PAR UN POINT");
		}else {
			while(tableau_chaine[i] != '.') {
				if(tableau_chaine[i] == lettre) {
					occurrence++;
				}
				i++;
			}
			
			System.out.println(lettre + " A " + occurrence + " OCCURENCE(S)");
		}
										
		// FIN PROGRAMME
		
		// DEBUT TESTS
		
		if(tableau_chaine.length == 0 && lettre == 'a') System.out.println("test 1 : " + (occurrence == 0));
		if(tableau_chaine.length == 1 && lettre == 'a') System.out.println("test 2 : " + (occurrence == 0));
		if(lettre == 'a' && chaine.equals("Cras eget tellus et nibh porta egestas.")) System.out.println("test 3 : " + (occurrence == 3));
		if(lettre == 'a' && chaine.equals("Cras eget tellus et nibh porta egestas")) System.out.println("test 4 : " + (occurrence == 0));
		if(lettre == 'z' && chaine.equals("Cras eget tellus et nibh porta egestas.")) System.out.println("test 5 : " + (occurrence == 0));
		
		// FIN TESTS
	}

}
