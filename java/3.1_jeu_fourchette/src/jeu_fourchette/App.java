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
		
		// DEBUT PROGRAMME
		
		Random rand = new Random();
		n = rand.nextInt(maxRandom - minRandom + 1) + minRandom;	
		
		do {
			System.out.println("deviner le nombre mystere entre " + minRandom + " et " + maxRandom);
			choix = sc.nextInt();
			
			essai++;
			
			if(choix != n) {
				if(choix < n) {
					minRandom = choix;
				} else {
					maxRandom = choix;
				}
			}			
		}while(n != choix);
		
		System.out.println("Bravo vous avez trouve en " + essai + " essais");
		
		sc.close();
		
		// FIN PROGRAMME			
	}

}
