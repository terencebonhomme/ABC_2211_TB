package pourcentage_debit;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int carte_bleue, cheque, virement, total;
		Scanner sc = new Scanner(System.in);
		
		// PROGRAMME
		
		System.out.print("Nombre de paiement par Carte Bleue : ");
		carte_bleue = sc.nextInt();
		
		System.out.print("Nombre de chèques émis : ");
		cheque = sc.nextInt();
		
		System.out.print("Nombre de virements automatiques : ");
		virement = sc.nextInt();
		
		total = carte_bleue + cheque + virement;
		
		System.out.println("Vous avez emis " + total + " ordres de debit donc : ");
		System.out.println("\t" + pourcentage(carte_bleue, total) + "% par Carte Bleue");
		System.out.println("\t" + pourcentage(cheque, total) + "% par Carte Bleue");
		System.out.println("\t" + pourcentage(virement, total) + "% par Carte Bleue");
		
		// FIN PROGRAMME
				
	}
	
	public static double pourcentage(int paiement, int total) {
		
		// FONCTION
		
		return (double) paiement / total * 100D;
		
		// FIN FONCTION
	}

}
