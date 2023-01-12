package aire_secteur_angulaire;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int rayon;
		int angle;
		double aire;		
		Scanner sc = new Scanner(System.in);
		
		// JEU DE TESTS
		
		System.out.println("test 1 : rayon " + 5 + " et angle " + 60);
		System.out.println("test 2 : rayon " + 7 + " et angle " + 30);
		System.out.println("test 3 : rayon " + 10 + " et angle " + 180);
		System.out.println("");
		
		// DEBUT PROGRAMME
		
		System.out.println("Veuillez écrire le rayon cercle et un angle");
		rayon = sc.nextInt();
		angle = sc.nextInt();
		
		aire = Math.PI * Math.pow(rayon, 2) * angle / 360;
		System.out.println("L'aire du secteur angulaire est " + aire);
		
		sc.close();
		
		// FIN PROGRAMME
		
		// DEBUT TESTS
		
		System.out.println("");		
		if(rayon == 5 && angle == 60) {
			System.out.println("test 1 : " + (aire >= 13.089 && aire <= 13.090));
		}		
		if(rayon == 7 && angle == 30) {
			System.out.println("test 2 : " + (aire >= 12.828 && aire <= 12.829));
		}		
		if(rayon == 10 && angle == 180) {
			System.out.println("test 3 : " + (aire >= 157.079 && aire <= 157.080));
		}
		
		// FIN TESTS
	}

}
