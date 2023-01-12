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
		
		// JEU DE TESTS
		
		System.out.println("test 1 : somme 250, interet 5 et annees 10");
		System.out.println("test 2 : somme 3000, interet 2 et annees 21");
		System.out.println("test 3 : somme 10000, interet 1 et annees 5");
		System.out.println("");
		
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
		
		// DEBUT TESTS
		
		System.out.println("");
		if(somme == 250 && txInteret == 5 && nbAnnee == 10) {
			System.out.println("test 1 : simple " + (sommeSimple == 375) + " et composee " + (sommeComposee >= 407.223 && sommeComposee <= 407.224));
		}
		if(somme == 3000 && txInteret == 2 && nbAnnee == 21) {
			System.out.println("test 2 : simple " + (sommeSimple == 4260) + " et composee " + (sommeComposee >=  4546.999 && sommeComposee <= 4547.000));
		}
		if(somme == 10000 && txInteret == 1 && nbAnnee == 5) {
			System.out.println("test 3 : simple " + (sommeSimple == 10500) + " et composee " + (sommeComposee >= 10510.100 && sommeComposee <= 10510.101));
		}
		
		// FIN TESTS
	}

}
