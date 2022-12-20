package aire_secteur_angulaire;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int rayon;
		int angle;
		double aire;		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("Veuillez écrire le rayon cercle et un angle");
		rayon = sc.nextInt();
		angle = sc.nextInt();
		
		aire = Math.PI * Math.pow(rayon, 2) * angle / 360;
		System.out.println("L'aire du secteur angulaire est " + aire);
		System.out.println("a");
		System.out.print("a");
		
		sc.close();
		
		// FIN PROGRAMME
	}

}
