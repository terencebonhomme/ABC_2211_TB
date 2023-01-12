package annee_bissextile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int annee;
		
		Scanner sc = new Scanner(System.in);
		
		// JEU DE TESTS
		
		System.out.println("test 1 : annee 1992 est bissextile");
		System.out.println("test 2 : annee 2000 est bissextile");
		System.out.println("test 3 : annee 1900 est non bissextile");
		System.out.println("test 4 : annee 1999 est non bissextile");
		System.out.println("");
		
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
