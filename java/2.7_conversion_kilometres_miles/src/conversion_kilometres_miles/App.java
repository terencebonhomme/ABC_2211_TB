package conversion_kilometres_miles;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// VARIABLES

		Scanner sc = new Scanner(System.in);

		double distance;
		String reponse;
		boolean quit = false;

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
