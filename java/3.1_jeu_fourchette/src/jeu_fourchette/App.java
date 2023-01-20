package jeu_fourchette;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int n;
		int essai;
		int choix;
		int minRandom = 0;
		int maxRandom = 100;
		int minFourchette = 0;
		int maxFourchette = 100;
		
		Scanner sc = new Scanner(System.in);
		
		essai = 0;		
		
		// JEU DE TESTS
		
		System.out.println("test 1 : nombre inferieur a la fourchette");
		System.out.println("test 2 : nombre superieur a la fourchette");
		System.out.println("test 3 : nombre egal au nombre aléatoire");
		System.out.println("test 4 : nombre d'essais correct");
		System.out.println("");
		
		// DEBUT PROGRAMME
		
		Random rand = new Random();
		n = rand.nextInt(maxRandom - minRandom + 1) + minRandom;
		System.out.println(n);
		
		do {
			System.out.println("deviner le nombre mystere entre " + minFourchette + " et " + maxFourchette);
			choix = sc.nextInt();
			
			essai++;
			
			if(choix < n) {
				if(choix >= minFourchette) minFourchette = choix + 1;
			} else {
				if(choix <= maxFourchette) maxFourchette = choix - 1;
			}
				
		}while(n != choix);
		
		System.out.println("Bravo vous avez trouve en " + essai + " essais");
		
		sc.close();
		
		// FIN PROGRAMME			
	}

}
