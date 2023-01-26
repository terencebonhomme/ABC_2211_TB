package annee_bissextile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// VARIABLES
		
		Scanner sc = new Scanner(System.in); 
		
		// DEBUT PROGRAMME
		
		System.out.print("Saisir annee : ");		
		System.out.println("annee " + (bissextile(sc.nextInt()) ? "bissextile" : "non bissextile"));	
		
		sc.close();
		
		// FIN PROGRAMME

	}
	
	public static boolean bissextile(int annee) {
		
		// DEBUT FONCTION
				
		// negation de !(annee % 4 != 0 || (annee % 100 == 0 && annee % 400 != 0 ));
		return annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0);
		
		// FIN FONCTION
		
	}

}
