package conversion_kilometres_miles;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// VARIABLES

		Scanner sc = new Scanner(System.in);

		double distance;
		String reponse;
		boolean quit = false;
		
		// JEU DE TESTS
		
		System.out.println("test 1 : distance = 0 est hors intervalle");
		System.out.println("test 2 : distance = 1 vaut environ 0,621");
		System.out.println("test 3 : distance = 5000 vaut environ 3107,320");
		System.out.println("test 4 : distance = 1000000 vaut environ 621504,039");
		System.out.println("test 5 : distance = 0.01 vaut environ 0.006");
		System.out.println("test 6 : distance = 0.009 est hors intervalle");
		System.out.println("test 7 : distance = 1000000.1 est hors intervalle");
		System.out.println("");

		// DEBUT PROGRAMME

		while (!quit) {
			System.out.println("Saisir une distance entre 0.01 et 1000000; q pour quitter");
			reponse = sc.nextLine();

			if (reponse.equals("q")) {
				quit = true;
			} else {
				
				distance = Double.parseDouble(reponse);
				
				if (distance >= 0.01 && distance <= 1000000) {
					System.out.println(distance / 1.609);
				} else {
					System.out.println("La valeur doit être comprise entre 0.01 et 1000000");
				}
			}
		}
		
		sc.close();
		
		// FIN PROGRAMME
	}

}
