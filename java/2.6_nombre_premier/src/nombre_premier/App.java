package nombre_premier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int nombre;
		int i;
		boolean premier = true;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		/*
		 * nombre est premier jusqu'a preuve du contraire
		 * 
		 * on exclut 1 et nombre de la boucle
		 * 
		 * la boucle s'arrête dès qu'un diviseur est trouvé
		 */
		
		for(i = 2; i <= nombre - 1 && premier; i++) {
			if(nombre % i == 0) {
				premier = false;
			}
		}
		
		if(premier) {
			System.out.println(nombre + " est un nombre premier");
		}else {
			System.out.println(nombre + " n'est pas un nombre premier");
		}
		
		sc.close();		
		
		// FIN PROGRAMME
				
	}

}