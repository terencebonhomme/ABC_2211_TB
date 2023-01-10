package calcul_interets;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int somme;
		int txInteret;
		int nbAnnee;
		
		double sommeSimple;
		double sommeComposee;			
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("Veuillez entrer la somme");
		somme = sc.nextInt();
		
		System.out.println("Veuillez entrer le taux d’intérêt");
		txInteret = sc.nextInt();
		
		System.out.println("Veuillez entrer le nombre d’années du placement");
		nbAnnee = sc.nextInt();
		
		sommeSimple = somme * (1 + nbAnnee * txInteret/100d);		
		sommeComposee = somme * Math.pow(1 + txInteret/100d, nbAnnee);
		
		System.out.println("La somme avec un intérêt simple est " + sommeSimple + " et la somme avec un intérêt composé est " + sommeComposee);
		
		sc.close();
		
		// FIN PROGRAMME
	}

}
