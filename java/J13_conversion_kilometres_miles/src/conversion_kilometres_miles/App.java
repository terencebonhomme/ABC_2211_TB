package conversion_kilometres_miles;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		double distance_km = 0;
		double distance_miles;
		String reponse = "";
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		// DEBUT PROGRAMME					
		
		while(!reponse.equals("q")) {	
			System.out.println("Saisir une distance entre 0.01 et 1000000");
			distance_km = sc2.nextDouble();
			
			if(distance_km >= 0.01 && distance_km <= 1000000) {				
				System.out.println(distance_km / 1.609);
			} else {
				System.out.println("La valeur doit être comprise entre 0.01 et 1000000");
			}	
			
			System.out.println("q pour quitter, autre pour continue");
			reponse = sc1.nextLine();
		}	

		System.out.println("quitter");
		
		sc1.close();
		sc2.close();
		
		// FIN PROGRAMME
		
	}

}
