package annee_bissextile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int annee;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("Saisir l'annee");
		annee = sc.nextInt();
		
		if(annee % 4 != 0) {
			System.out.println("Non bissextile");
		} else {
			if(annee % 100 == 0 && annee % 400 != 0) {
				System.out.println("Non bissextile");
			} else {
				System.out.println("Bissextile");
			}
		}
		
		sc.close();
				
		// FIN PROGRAMME		
	}

}
