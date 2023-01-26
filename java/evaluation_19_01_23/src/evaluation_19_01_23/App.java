package evaluation_19_01_23;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// code modifie par rapport au pseudo code
		
		/**
		 * entier numero_mois
		 * tableau mois de chaines de caracteres 
		 * 
		 * faire
		 * 
		 * 		ecrire "Saisissez un numero de mois : "
		 * 			lire numero_mois
		 * 
		 * 		si numero >= 1 et numero <= 12 alors
		 * 			si mois(numero_mois - 1) = avril ou mois(numero_mois - 1) = aout ou mois(numero_mois - 1) = octobre alors
		 * 				si numero mod 2 = 0 alors
		 * 					// mois pair donc jours impairs
		 * 					écrire "Le mois d'", mois(numero), " est pair."
		 * 					écrire "Les jours impairs du mois sont : "
		 * 					pour numero_jour de 1 à 31 faire
		 * 						si numero_jour mod 2 = 1 et numero_jour mod 3 != 0 alors // jours impairs non multiple de 3
		 * 							ecrire numero_jour, ", "
		 *						fin si 	 
		 * 					fin pour
		 * 				sinon si numero mod 2 = 1 alors // eviter le sinon pour la clarte de la logique
		 * 					// mois impair donc jours pairs
		 * 					ecrire "Le mois d'", mois(numero), " est impair."
		 * 					ecrire "Les jours pairs du mois sont : "
		 * 					pour numero_jour de 1 à 31 faire
		 * 						si numero_jour mod 2 = 0 et numero_jour mod 10 != 0 alors // jours impairs non multiple de 10
		 * 							ecrire numero_jour, ", "
		 *						fin si 	 
		 * 					fin pour
		 * 				fin si
		 * 			sinon
		 * 				
		 * 			fin si
		 * 		sinon
		 * 			ecrire "Numero de mois invalide, veuillez recommencer"
		 * 		fin si 
		 * 	
		 * tant que numero_mois < 1 ou > 12
		 * 
		 */				
		
		// VARIABLES
		
		int numero_mois = 0;
		// on retire les accents
		String[] mois = new String[] {"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"};
		int[] nombre_jours = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		
		// l'utilisateur ne saisit pas l'annee; on considere que l'annee est non bissextile pour le mois de fevrier
		// on ne veut pas complexifier le programme ou s'eloigner de la consigne avec une nouvelle entree pour l'annee
		
		// DEBUT PROGRAMME
		
		// do while est la boucle la mieux adaptée car on doit demander au moins une fois la saisie
		// et on ne peut savoir le nombre de tentatives
		do {
			System.out.print("Saisissez un numero de mois : ");
			numero_mois = sc.nextInt();
			
			if(numero_mois >= 1 && numero_mois <= 12) {
				
				// mois pair
				if(numero_mois % 2 == 0) {
					
					// mois pair donc jours impairs
					
					// afficher le mois
					
					// affichage pour les mois qui commencent par une voyelle
					if( 
							mois[numero_mois - 1].equals("avril")
							|| mois[numero_mois - 1].equals("aout")
							|| mois[numero_mois - 1].equals("octobre") 
					){
						System.out.println("Le mois d'" + mois[numero_mois - 1] + " est pair.");
					// affichage pour les mois qui commencent par une consomne
					}else {
						System.out.println("Le mois de " + mois[numero_mois - 1] + " est pair.");
					}
										
					// afficher la liste des jours
					
					System.out.println("Les jours impairs sont :");
					
					for(int numero_jour = 1; numero_jour <= nombre_jours[numero_mois - 1]; numero_jour++) {
						if(numero_jour % 2 == 1 && numero_jour % 3 != 0) { // jours impairs non multiple de 3
							System.out.print(numero_jour + ", ");		
						}
					}
					
				// mois impair
				}else if(numero_mois % 2 == 1) { // eviter le sinon pour la clarte de la logique
					
					// mois impair donc jours pairs
				
					System.out.println("Le mois de " + mois[numero_mois - 1] + " est impair.");
					
					// afficher la liste des jours
					
					System.out.println("Les jours pairs sont :");
					
					for(int numero_jour = 1; numero_jour <= 31; numero_jour++) {
						if(numero_jour % 2 == 0 && numero_jour % 10 != 0) { // jours impairs non multiple de 3
							System.out.print(numero_jour + ", ");
						}
					}
										
				}else { // afficher" erreur "s'il y a un probleme, mais �a ne devrait jamais s'afficher
					System.out.print("Erreur");
				}
				
			}else {
				System.out.println("Numero de mois invalide, veuillez recommencer");
			}
			
		} while (numero_mois < 1 || numero_mois > 12);
		
		sc.close();
		
		// FIN PROGRAMME

	}

}
