package jeu_fourchette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int n;
		int essai;
		int choix;
		
		Scanner sc = new Scanner(System.in);
		
		essai = 0;	
		
		// DEBUT PROGRAMME
		
		n = (int) (Math.random() * 100);
		System.out.println(n);	
		
		do {
			System.out.println("deviner le nombre mystere");
			choix = sc.nextInt();
			
			essai++;
			
			if(choix != n) {
				if(choix < n) {
					System.out.println("plus grand");
				} else {
					System.out.println("plus petit");
				}
			}			
		}while(n != choix);
		
		System.out.println("Bravo vous avez trouve en " + essai + " essais");
		
		sc.close();
		
		// FIN PROGRAMME			
	}

}
